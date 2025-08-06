module org.exercicios.jogodogenio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.exercicios.jogodogenio to javafx.fxml;
    exports org.exercicios.jogodogenio;
}