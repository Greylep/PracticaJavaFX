package org.example.practicajavafx.modelos;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.ToString;

@ToString
public class Tarea {
    // Usamos Propiedades Observables, crucial para TableView
    private final StringProperty titulo;
    private final StringProperty prioridad;

    public Tarea(String titulo, String prioridad) {
        this.titulo = new SimpleStringProperty(titulo);
        this.prioridad = new SimpleStringProperty(prioridad);
    }

    // Métodos Property: El setCellValueFactory busca estos nombres.
    public StringProperty tituloProperty() {
        return titulo;
    }

    public StringProperty prioridadProperty() {
        return prioridad;
    }

    public String getTitulo() { return titulo.get(); }
    public String getPrioridad() { return prioridad.get(); }
}