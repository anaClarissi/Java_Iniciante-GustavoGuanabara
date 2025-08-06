module org.exercicios.verificadoridadesjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.exercicios.verificadoridadesjavafx to javafx.fxml;
    exports org.exercicios.verificadoridadesjavafx;
}