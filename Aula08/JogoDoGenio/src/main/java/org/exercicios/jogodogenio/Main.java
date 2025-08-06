package org.exercicios.jogodogenio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader janela = new FXMLLoader(Main.class.getResource("TelaGenio.fxml"));
        Scene tela = new Scene(janela.load());

        stage.setTitle("Jogo da Adivinhação");
        stage.setScene(tela);
        stage.show();

    }

    public static void main(String[] args) {

        launch();

    }

}
