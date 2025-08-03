package org.example.supercalculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SuperCalculadora extends Application {

    @Override
    public void start(Stage stage) throws IOException{

        FXMLLoader janela = new FXMLLoader(SuperCalculadora.class.getResource("telaSuperCalculadora.fxml"));

        Scene tela = new Scene(janela.load());

        stage.setTitle("Super Calculadora");
        stage.setScene(tela);
        stage.show();

    }

    public static void main(String[] args) {

        launch();

    }

}
