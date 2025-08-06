package org.exercicios.verificadoridadesjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VerificadorIdades extends Application {

    @Override
    public void start(Stage stage) throws IOException{

        FXMLLoader janela = new FXMLLoader(VerificadorIdades.class.getResource("TelaVerificador.fxml"));
        Scene tela = new Scene(janela.load());

        stage.setTitle("Verificador De Idades");
        stage.setScene(tela);
        stage.show();

    }


    public static void main(String[] args) {

        launch();

    }

}
