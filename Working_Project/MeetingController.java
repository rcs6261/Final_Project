package controller;

import final_project.DataStore;
import final_project.Meeting;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;


public class MeetingController {
    //FXML variables
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;
    @FXML private TextField locationField;

    //Saves a new meeting to the calendar
    @FXML
    public void save(){
        try{
            //Saves entered values into class variables
            String title = titleField.getText();
            LocalDate date = datePicker.getValue();
            String description = descriptionField.getText();
            String location = locationField.getText();

            //Creates a new meeting with the entered variables
            Meeting meeting = new Meeting(title,date,description,location);

            //Stores the data provided
            DataStore.calendar.addEvent(meeting);

            //Goes to the main scene
            goBack();

        //Catches invalid inputs
        } catch (Exception e) {
            System.out.println("Invalid Input" + e.getMessage());

        }
    }
    //Method to switch the scene back to the main fxml using the goback button
    @FXML
    public void goBack(){
        SceneManager.switchScene("main.fxml");
    }

}
