package org.example.operadoresjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OperadoresController {

    @FXML
    public TextField txtNumerador;
    public TextField txtDenominador;
    public Label lblResultadoDivisao;
    public Label lblResultadoResto;

    @FXML
    public void dividirValores(){

        int numerador = Integer.parseInt(txtNumerador.getText());
        int denominador = Integer.parseInt(txtDenominador.getText());

        int divisao = numerador / denominador;
        int resto = numerador % denominador;

        lblResultadoDivisao.setText(String.valueOf(divisao));
        lblResultadoResto.setText(String.valueOf(resto));

    }

}
