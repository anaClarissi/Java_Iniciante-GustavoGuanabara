package org.exercicios.programaparimparjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VerificarParImpar {

    @FXML
    public TextField txtValorDigitadoPeloUsuario;
    public Label lblResultadoDoValorDoUsuario;

    @FXML
    public void verificarParOuImpar(){

        int valorDigitadoPeloUsuario = Integer.parseInt(txtValorDigitadoPeloUsuario.getText());
        String resultado;

        if (valorDigitadoPeloUsuario % 2 == 0) {

            resultado = "PAR";

        } else {

            resultado = "IMPAR";

        }

        lblResultadoDoValorDoUsuario.setText(resultado);

    }

}
