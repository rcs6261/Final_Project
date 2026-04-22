package controller;

import final_project.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalTime;

public class AppointmentController {
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;
    @FXML private TextField startTimeField;
    @FXML private TextField endTimeField;
    @FXML private TextField locationField;


    @FXML
    public void save(){
        try{
            Appointment appointment = new Appointment(titleField.getText(), datePicker.getValue(),
                    descriptionField.getText(), LocalTime.parse(startTimeField.getText()), LocalTime.parse(endTimeField.getText()),
                    locationField.getText());

            goBack();

        }catch (Exception e){
            System.out.println("Invalid Input" + e.getMessage());
        }

    }
    @FXML
    public void goBack(){
        SceneManager.switchScene("main.fxml");
    }
}
