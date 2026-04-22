package controller;

import final_project.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class EventController {
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;

    @FXML
    public void save(){
        try{
            String title = titleField.getText();
            LocalDate date = datePicker.getValue();
            String description = descriptionField.getText();

            Event event = new Event(title, date, description){
                @Override
                public String getDetails(){
                    return "[title] " + title + "\nDate: " + date +"\nTime" + "\nDescription: " + description;
                }
            };

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
