module org.example.operadoresjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.operadoresjavafx to javafx.fxml;
    exports org.example.operadoresjavafx;
}