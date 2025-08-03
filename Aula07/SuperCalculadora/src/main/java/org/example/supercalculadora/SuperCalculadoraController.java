package org.example.supercalculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;


public class SuperCalculadoraController {

    @FXML
    public Label lblResultadoRestoDivisao;
    public Label lblResultadoElevadoCubo;
    public Label lblResultadoRaizQuadrada;
    public Label lblResultadoRaizCubica;
    public Label lblResultadoValorAbsoluto;
    public Spinner<Integer> txtValor;

    @FXML
    public void initialize(){

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,999999999,0);
        txtValor.setValueFactory(valueFactory);

    }

    @FXML
    public void calcularValoresSuperCalculadora(){

        int valorUsuario = txtValor.getValue();

        int restoDivisaoPorDois = valorUsuario % 2;
        double elevadoAoCubo = Math.pow(valorUsuario, 3);
        double raizQuadrada = Math.sqrt(valorUsuario);
        double raizCubica = Math.cbrt(valorUsuario);
        int valorAbsoluto = Math.abs(valorUsuario);

        lblResultadoRestoDivisao.setText(String.valueOf(restoDivisaoPorDois));
        lblResultadoElevadoCubo.setText(String.format("%.1f",elevadoAoCubo));
        lblResultadoRaizQuadrada.setText(String.format("%.1f",raizQuadrada));
        lblResultadoRaizCubica.setText(String.format("%.1f",raizCubica));
        lblResultadoValorAbsoluto.setText(String.valueOf(valorAbsoluto));

    }

}
