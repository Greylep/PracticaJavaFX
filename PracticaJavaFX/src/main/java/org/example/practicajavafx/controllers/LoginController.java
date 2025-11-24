package org.example.practicajavafx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.Node; // Necesario para acceder a la jerarquía de la escena
import javafx.stage.Stage;
import org.example.practicajavafx.utils.JavaFXUtil;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label messageLabel;

    @FXML
    private void handleLoginAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Lógica de Negocio Simulada
        if ("pedrito".equals(username) && "tronco23".equals(password)) {
            messageLabel.setText("Perfe, cargando nueva ventana ... ");

            // Lógica de Navegación (Replicando la estructura del proyecto de GitHub)
            // Obtenemos la referencia a la ventana (Stage) actual desde el componente (Node) que disparó el evento.
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Navegamos a la vista principal (main-view.fxml, que crearemos después)
            JavaFXUtil.loadScene(currentStage, "main-view.fxml", "Main View");

        } else {
            messageLabel.setText("ERROR!");
        }
    }
}