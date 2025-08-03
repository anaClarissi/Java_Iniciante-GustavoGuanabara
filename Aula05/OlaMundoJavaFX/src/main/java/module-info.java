module org.example.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.olamundojavafx to javafx.fxml;
    exports org.example.olamundojavafx;
}