package org.example.practicajavafx.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import org.example.practicajavafx.modelos.Tarea; // Importamos el Modelo
import org.example.practicajavafx.utils.JavaFXUtil; // Importamos la Utilidad de Navegación

public class MainController {

    // 1. Inyección de Componentes (Contrato de la Vista)
    @FXML private TableView<Tarea> tareaTable;
    @FXML private TableColumn<Tarea, String> tituloColumn;
    @FXML private TableColumn<Tarea, String> prioridadColumn;

    // Métodos de Evento (Contrato de Acciones - Simuladas)

    @FXML
    public void initialize() {
        // Método de inicialización: se llama después de la inyección @FXML.

        // Simulación de Lógica de Negocio (Datos)
        ObservableList<Tarea> listaTareas = FXCollections.observableArrayList(
                new Tarea("Preparar examen JavaFX", "Alta"),
                new Tarea("Revisar pom.xml", "Media"),
                new Tarea("Crear clase Tarea.java", "Baja")
        );

        // 2. Enlace de Datos (Binding)
        // CRUCIAL: setCellValueFactory enlaza el objeto Tarea (Value)
        // con la propiedad observable específica (String "titulo" -> busca tituloProperty())
        tituloColumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        prioridadColumn.setCellValueFactory(new PropertyValueFactory<>("prioridad"));

        // Cargar los datos simulados en la tabla
        tareaTable.setItems(listaTareas);
    }

    // Acciones CRUD (Simuladas)
    @FXML
    private void handleAddAction(ActionEvent event) {
        System.out.println("SIMULACIÓN: Abriendo ventana para añadir tarea...");
    }

    @FXML
    private void handleEditAction(ActionEvent event) {
        System.out.println("SIMULACIÓN: Abriendo ventana para editar la tarea seleccionada...");
    }

    @FXML
    private void handleDeleteAction(ActionEvent event) {
        System.out.println("SIMULACIÓN: Eliminando la tarea seleccionada...");
    }

    // Acción de Cerrar Sesión (Navegación)
    @FXML
    private void handleLogoutAction(ActionEvent event) {
        System.out.println("Cerrando sesión...");

        // Obtenemos el Stage actual
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Navegamos de vuelta a la vista de login
        JavaFXUtil.loadScene(currentStage, "login-view.fxml", "Gestor de Tareas - Login");
    }
}