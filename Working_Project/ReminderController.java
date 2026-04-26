package controller;

import final_project.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalTime;


public class ReminderController {
    //FXML Variables
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;
    @FXML private TextField timeField;

    //Saves a new reminder to the calendar
    @FXML
    public void save(){
        try{
            //Stores entered values into class variables
            String title = titleField.getText();
            LocalDate date = datePicker.getValue();
            String description = descriptionField.getText();
            LocalTime time = LocalTime.parse(timeField.getText());

            //Creates a new reminder using entered in values
            Reminder reminder = new Reminder(title, date, description, time);

            //Stores the data provided
            DataStore.calendar.addEvent(reminder);

            //Goes to the main scene
            goBack();

        //Catches an invalid input
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
