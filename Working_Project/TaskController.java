package controller;

import final_project.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class TaskController {
    //FXML Variables
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;
    @FXML private CheckBox completedBox;

    //Saves a task to the main calendar
    @FXML
    public void save(){
        try{
            //Stores entered values as class variables
            String title = titleField.getText();
            LocalDate date = datePicker.getValue();
            String description = descriptionField.getText();
            boolean completed = completedBox.isSelected();

            //Creates a new task using entered variables
            Task task = new Task(title,date,description,completed);

            //Stores the data provided
            DataStore.calendar.addEvent(task);

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
