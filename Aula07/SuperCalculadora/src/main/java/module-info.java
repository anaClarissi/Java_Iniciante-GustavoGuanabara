module org.example.supercalculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.supercalculadora to javafx.fxml;
    exports org.example.supercalculadora;
}