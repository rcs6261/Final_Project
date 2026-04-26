package controller;

import final_project.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalTime;

public class AppointmentController {
    //Scene Variables
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;
    @FXML private TextField startTimeField;
    @FXML private TextField endTimeField;
    @FXML private TextField locationField;

    //Saves a new appointment into the calendar
    @FXML
    public void save(){
        try{
            //Stores appointment variables into a new appointment
            Appointment appointment = new Appointment(titleField.getText(), datePicker.getValue(),
                    descriptionField.getText(), LocalTime.parse(startTimeField.getText()), LocalTime.parse(endTimeField.getText()),
                    locationField.getText());

            //Stores the data provided
            DataStore.calendar.addEvent(appointment);

            goBack();  //Goes back to the main scene
        //Catches invalid inputs
        }catch (Exception e){
            System.out.println("Invalid Input" + e.getMessage());
        }

    }
    //Method to switch the scene back to the main fxml using the goback button
    @FXML
    public void goBack(){
        SceneManager.switchScene("main.fxml");
    }
}
