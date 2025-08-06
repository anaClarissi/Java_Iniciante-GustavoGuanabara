package org.exercicios.programaparimparjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException{

        FXMLLoader janela = new FXMLLoader(Main.class.getResource("TelaParImpar.fxml"));
        Scene tela = new Scene(janela.load());

        stage.setTitle("Par Ou Impar");
        stage.setScene(tela);
        stage.show();

    }

    public static void main(String[] args) {

        launch();

    }

}
