package org.exercicios.verificadoridadesjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.Year;

public class FuncoesDoVerificador {

    @FXML
    public Label lblIdadeDoUsuario;
    public Label lblSituacaoDoUsuario;
    public TextField txtAnoDeNascimentoUsuario;

    @FXML
    public void calcularIdadeDoUsuario(){

        Year anoAtualDoSistema = Year.now();
        int anoDeNascimentoDoUsuario = Integer.parseInt(txtAnoDeNascimentoUsuario.getText());

        int idadeDoUsuario =  Integer.parseInt(String.valueOf(anoAtualDoSistema)) - anoDeNascimentoDoUsuario;
        lblIdadeDoUsuario.setText(String.valueOf(idadeDoUsuario));

        String situacaoDoUsuario = (idadeDoUsuario < 18 || idadeDoUsuario > 60)? "Opicional":"Não Opicional";
        lblSituacaoDoUsuario.setText(situacaoDoUsuario);

    }

}
