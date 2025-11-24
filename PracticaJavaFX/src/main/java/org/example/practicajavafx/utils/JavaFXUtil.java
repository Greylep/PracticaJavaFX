package org.example.practicajavafx.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.practicajavafx.HelloApplication;
import java.io.IOException;


public class JavaFXUtil {

    /**
     * Carga y establece una nueva escena FXML en el Stage proporcionado.
     * Stage: El Stage (ventana) actual.
     * fxml: El nombre del archivo FXML (ej: "main-view.fxml").
     * title: Título de la nueva ventana.
     */
    public static void loadScene(Stage stage, String fxml, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/" + fxml));
            Scene scene = new Scene(fxmlLoader.load());

            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar la escena: " + fxml);
            e.printStackTrace();
        }
    }
}