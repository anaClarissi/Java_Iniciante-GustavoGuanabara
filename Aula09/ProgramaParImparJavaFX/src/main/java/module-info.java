module org.exercicios.programaparimparjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.exercicios.programaparimparjavafx to javafx.fxml;
    exports org.exercicios.programaparimparjavafx;
}