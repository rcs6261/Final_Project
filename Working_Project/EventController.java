package controller;

import final_project.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class EventController {
    //FXML Variables
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;

    //Saves a new event into the calendar
    @FXML
    public void save(){
        try{
            //Stores FXML into variables
            String title = titleField.getText();
            LocalDate date = datePicker.getValue();
            String description = descriptionField.getText();
            //Creates new event
            Miscellaneous miscellaneous = new Miscellaneous(title, date, description);

            //Stores the data provided
            DataStore.calendar.addEvent(miscellaneous);

            //Goes back to the main scene
            goBack();

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
