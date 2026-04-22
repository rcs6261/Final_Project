package controller;

import final_project.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class TaskController {
    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextField descriptionField;
    @FXML private CheckBox completedBox;

    @FXML
    public void save(){
        try{
            String title = titleField.getText();
            LocalDate date = datePicker.getValue();
            String description = descriptionField.getText();
            boolean completed = completedBox.isSelected();
            Task task = new Task(title,date,description,completed);

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
