module org.exercicios.votacaojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.exercicios.votacaojavafx to javafx.fxml;
    exports org.exercicios.votacaojavafx;
}