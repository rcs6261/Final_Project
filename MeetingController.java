package controller;

import final_project.Meeting;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;


public class MeetingController {
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;
    @FXML private TextField LocationField;

    @FXML
    public void save(){
        try{
            String title = titleField.getText();
            LocalDate date = datePicker.getValue();
            String description = descriptionField.getText();
            String location = LocationField.getText();

            Meeting meeting = new Meeting(title,date,description,location);

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
