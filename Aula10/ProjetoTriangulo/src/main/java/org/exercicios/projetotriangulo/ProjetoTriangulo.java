package org.exercicios.projetotriangulo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjetoTriangulo extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader janela = new FXMLLoader(ProjetoTriangulo.class.getResource("TelaTriangulo.fxml"));
        Scene tela = new Scene(janela.load());

        stage.setTitle("Verificar Triângulo");
        stage.setScene(tela);
        stage.show();

    }


    public static void main(String[] args) {

        launch();

    }

}
