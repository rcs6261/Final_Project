package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
        @Override
        public void start(Stage stage) throws Exception{
            SceneManager.setStage(stage); //Stores the primary stage in the Scene Manager
            Parent root = FXMLLoader.load(getClass().getResource("/final_project/main.fxml")); //Loads the main fxml file

            Scene scene = new Scene(root); //Creates a scene using the loaded fxml
            stage.setTitle("Scheduling Application"); //Sets the title of the window
            stage.setScene(scene); //Sets the scene to the stage
            stage.show(); //Displays the window
        }

        public static void main(String[] args) {
            launch(args); //Launches JavaFX
        }
    }

