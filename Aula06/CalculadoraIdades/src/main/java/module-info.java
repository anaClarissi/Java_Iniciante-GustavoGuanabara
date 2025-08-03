module org.example.calculadoraidades {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.calculadoraidades to javafx.fxml;
    exports org.example.calculadoraidades;
}