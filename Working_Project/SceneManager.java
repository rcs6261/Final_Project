package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class SceneManager {
    private static Stage stage;

    //Sets the stage
    public static void setStage(Stage primarystage) {
        stage = primarystage;
    }

    //Method to switch the scene to one provided
    public static void switchScene(String fxmlFile) {
        try{
            Parent root = FXMLLoader.load(SceneManager.class.getResource("/final_project/" + fxmlFile)); //Stores the scene as root
            stage.setScene(new Scene(root)); //Sets a new scene using the provided root
            stage.show(); //Shows the scene
        //Catches any failures to load the scene
        } catch (IOException e) {
            System.out.println("Failed to load scene " + fxmlFile);
            e.printStackTrace();
        }
    }
}
