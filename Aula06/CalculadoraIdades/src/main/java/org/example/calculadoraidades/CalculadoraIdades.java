package org.example.calculadoraidades;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculadoraIdades extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader janela = new FXMLLoader(CalculadoraIdades.class.getResource("tela.fxml"));
        Scene tela = new Scene(janela.load(), 400, 350);
        stage.setTitle("Calculadora de Idade");
        stage.setScene(tela);
        stage.show();

    }

    public static void main(String[] args) {

        launch();

    }

}
