package org.example.practicajavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    // Método que inicia la interfaz
    @Override
    public void start(Stage stage) throws IOException {
        // 1. Crear el cargador y buscar la vista de login
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/login-view.fxml"));

        // 2. Cargar la vista y crear la escena
        Scene scene = new Scene(fxmlLoader.load(), 450, 350);

        // 3. Configurar y mostrar la ventana (Stage)
        stage.setTitle("Gestor de Tareas - Login");
        stage.setScene(scene);
        stage.show();
    }

    // Método main para compatibilidad (llama a launch())
    public static void main(String[] args) {
        launch();
    }
}