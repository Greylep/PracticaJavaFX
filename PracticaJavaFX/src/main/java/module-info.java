module org.example.practicajavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    // Paquete base y de controladores
    opens   org.example.practicajavafx to javafx.fxml;
    exports org.example.practicajavafx;

    // Abrir y exportar paquetes MVC y utilidades
    exports org.example.practicajavafx.controllers;
    opens   org.example.practicajavafx.controllers to javafx.fxml;

    exports org.example.practicajavafx.utils;
    exports org.example.practicajavafx.modelos;


}