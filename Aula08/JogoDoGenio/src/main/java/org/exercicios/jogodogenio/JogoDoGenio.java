package org.exercicios.jogodogenio;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.awt.*;


public class JogoDoGenio {

    @FXML
    public Spinner<Integer> txtValorDoUsuario;
    public Label lblResultadoDoPalpite;

    @FXML
    public void initialize(){


        SpinnerValueFactory <Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,5,5);
        txtValorDoUsuario.setValueFactory(valueFactory);

    }


    @FXML
    public void verificarValorDoUsuaio(){

        double numeroDoComputador = Math.random();
        int numeroAleatorio = (int) (1 + numeroDoComputador * (5 - 1));
        int valorDoUsuario = txtValorDoUsuario.getValue();

        String resultado = (valorDoUsuario == numeroAleatorio) ? "Acertou!":"Errou!";
        lblResultadoDoPalpite.setText(resultado);

    }

}
