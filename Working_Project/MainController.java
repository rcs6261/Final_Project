package controller;

import final_project.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;

public class MainController {
    //FXML Variables
    @FXML private TableView<Event> mainTable;
    
    @FXML private TableColumn<Event, String> titleColumn;
    @FXML private TableColumn<Event, String> dateColumn;
    @FXML private TableColumn<Event, String> typeColumn;

    @FXML private VBox editPane;
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    
    private ObservableList<Event> eventList;
    
    @FXML
    public void initialize(){
        //Convert array list into an observable list
        eventList = FXCollections.observableArrayList(DataStore.calendar.getEvents());

        mainTable.setItems(eventList); //Sets the tableview to display the observable list

        //Defines the value for the title column
        titleColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTitle()));

        //Defines the value for the date column
        dateColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDate().toString()));

        //Defines the value for the Type column
        typeColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getClass().getSimpleName()));

        //Sets a custom behavior for each row in the table
        mainTable.setRowFactory(tv -> {
            TableRow<Event> row = new TableRow<>(); //Creates a new table row for each event

            //Add mouse click functionality to entered in events
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && !row.isEmpty()) { //Checks if an event is clicked twice and that the row is not empty
                    Event selectedEvent = row.getItem(); //Gets the object from the selected row

                    Alert alert = new Alert(Alert.AlertType.INFORMATION); //Creates an information pop-up
                    alert.setTitle("Event Details"); //Sets title for the pop-up
                    alert.setHeaderText(selectedEvent.getTitle());  //Sets the header text to the event title

                    alert.setContentText(selectedEvent.toString()); //Sets all event information into the body

                    alert.showAndWait(); //Shows pop-up and waits until its closed
                }
            });
            return row; //Returns the row back to table view
        });
    }
    @FXML
    public void openAppointments(){
        SceneManager.switchScene("appointment.fxml"); //Uses the SceneManager to switch the scene to the appointment GUI
    }

    @FXML
    public void openEvents(){
        SceneManager.switchScene("event.fxml"); //Uses the SceneManager to switch the scene to the event GUI
    }

    @FXML
    public void openMeetings(){
        SceneManager.switchScene("meeting.fxml"); //Uses the SceneManager to switch the scene to the meeting GUI
    }

    @FXML
    public void openReminders(){
        SceneManager.switchScene("reminder.fxml"); //Uses the SceneManager to switch the scene to the reminder GUI
    }

    @FXML
    public void openTasks(){
        SceneManager.switchScene("task.fxml"); //Uses the SceneManager to switch the scene to the task GUI
    }

    @FXML
    public void editItem(){
        Event selectedEvent = mainTable.getSelectionModel().getSelectedItem(); //Acquires an event that is currently selected

        if (selectedEvent == null){ //Checks if an event is selected
            Alert alert = new Alert(Alert.AlertType.WARNING); //Gives a warning message
            alert.setContentText("Select an event to be edited"); //Gives contents of the warning message
            alert.showAndWait(); //Shows the warning and waits for user input
        }
        DataStore.selectedEvent = selectedEvent; //Stores the selected event in datastore

        titleField.setText(selectedEvent.getTitle()); //Sets the new title
        datePicker.setValue(selectedEvent.getDate()); //Sets the new date

        editPane.setVisible(true); //Edit pane is made visible
        mainTable.setDisable(true); //Main window is removed from view
    }

    @FXML
    public void saveEdit(){
        Event editEvent = DataStore.selectedEvent; //Stores the selected event as editEvent

        editEvent.setTitle(titleField.getText());
        editEvent.setDate(datePicker.getValue()); //Gets the

        mainTable.refresh(); //Refreshes the table

        editPane.setVisible(false); //Removes the edit pane
        mainTable.setDisable(false); //Brings back the main window
    }

    @FXML
    public void cancelEdit(){
        editPane.setVisible(false); //Removes the edit pane from the screen
        mainTable.setDisable(false); //Brings back the main window
    }

    @FXML
    public void deleteItem(){
        Event selectedEvent = mainTable.getSelectionModel().getSelectedItem(); //Acquires an event that is currently selected

        if (selectedEvent != null) { //Checks if there is an actual selected event
            Alert alert = new Alert(Alert.AlertType.WARNING); //Creates a warning if event is selected
            alert.setTitle("Deleting Event"); //Title of the warning
            alert.setHeaderText(null);
            alert.setContentText("You are deleting the selected Event"); //Gives content of the warning as just a warning that the content of the event is being deleted
            alert.showAndWait(); //Waits for user response
        }
        //Remove from the DataStore
        DataStore.calendar.removeEvent(selectedEvent);

        //Remove from the table view
        mainTable.getItems().remove(selectedEvent);

    }


}

