package org.exercicios.votacaojavafx;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VotacaoJavaFX extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader janela = new FXMLLoader(VotacaoJavaFX.class.getResource("TelaVoto.fxml"));
        Scene tela = new Scene(janela.load());

        stage.setTitle("Votoção");
        stage.setScene(tela);
        stage.show();

    }


    public static void main(String[] args) {

        launch();

    }

}
