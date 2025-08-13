package org.exercicios.votacaojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.time.Year;

public class VotacaoController {

    @FXML
    public Spinner<Integer> txtAnoNascimentoUsuario;
    public Label lblIdadeUsuario, lblResultadoVerificacaoIdadeUsuario;

    public int anoAtual, idadeUsuario;
    public String statusVotacaoUsuario;

    @FXML
    public void initialize(){

        anoAtual = Integer.parseInt(Year.now().toString());

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(anoAtual - 120, anoAtual, anoAtual);
        txtAnoNascimentoUsuario.setValueFactory(valueFactory);



    }
    @FXML
    public void mudarIdadeUsuario(){

        idadeUsuario = anoAtual - txtAnoNascimentoUsuario.getValue();
        lblIdadeUsuario.setText(String.valueOf(idadeUsuario));

    }



    @FXML
    public void verificarIdadeUsuario(){

        idadeUsuario = anoAtual - txtAnoNascimentoUsuario.getValue();

        if (idadeUsuario >= 18 && idadeUsuario <= 70){

            this.statusVotacaoUsuario = "Voto Obrigatório";

        }
        else if (idadeUsuario < 16){

            this.statusVotacaoUsuario = "Não Vota";

        }
        else {

            this.statusVotacaoUsuario = "Voto Opcional";

        }


        lblResultadoVerificacaoIdadeUsuario.setText(statusVotacaoUsuario);
        System.out.println(idadeUsuario);

        lblIdadeUsuario.setText(String.valueOf(idadeUsuario));

    }



}
