package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class SceneManager {
    private static Stage stage;

    public static void setStage(Stage primarystage) {
        stage = primarystage;
    }

    public static void switchScene(String fxmlFile) {
        try{
            Parent root = FXMLLoader.load(SceneManager.class.getResource("/final_project/" + fxmlFile));
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Failed to load scene " + fxmlFile);
            e.printStackTrace();
        }
    }
}
