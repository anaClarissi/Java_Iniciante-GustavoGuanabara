package org.example.operadoresjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OperadoresJavaFX extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader janela = new FXMLLoader(OperadoresJavaFX.class.getResource("telaOperadores.fxml"));

        Scene tela = new Scene(janela.load());

        stage.setTitle("Operadores Aritméticos");
        stage.setScene(tela);
        stage.show();

    }

    public static void main(String[] args) {

        launch();

    }

}
