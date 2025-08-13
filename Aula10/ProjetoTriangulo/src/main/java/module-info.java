module org.exercicios.projetotriangulo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.exercicios.projetotriangulo to javafx.fxml;
    exports org.exercicios.projetotriangulo;
}