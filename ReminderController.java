package controller;

import final_project.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalTime;


public class ReminderController {
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;
    @FXML private TextField timeField;

    @FXML
    public void save(){
        try{
            String title = titleField.getText();
            LocalDate date = datePicker.getValue();
            String description = descriptionField.getText();
            LocalTime time = LocalTime.parse(timeField.getText());

            Reminder reminder = new Reminder(title, date, description, time);

            goBack();
        } catch (Exception e) {
            System.out.println("Invalid Input" + e.getMessage());
        }
    }
    @FXML
    public void goBack(){
        SceneManager.switchScene("main.fxml");
    }
}
