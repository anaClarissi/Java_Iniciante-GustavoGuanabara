package org.example.calculadoraidades;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.time.Year;


public class CalculadoraIdadesController {

    @FXML
    public Label lblIdade;
    public Spinner<Integer> txtAnoNascimento;
    public Label lblAnoAtual;

    @FXML
    public void initialize(){

        int anoAtual = Year.now().getValue();
        lblAnoAtual.setText(String.valueOf(anoAtual));

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1900, anoAtual, anoAtual);
        txtAnoNascimento.setValueFactory(valueFactory);


    }

    @FXML
    public void calcularIdadeAnoNascimento(){

        Integer anoNascimento = txtAnoNascimento.getValue();

        if (anoNascimento != null){

            int idade = Year.now().getValue() - anoNascimento;

            lblIdade.setText(String.valueOf(idade));

        } else {

            lblIdade.setText("Ano Iválido");

        }

    }

}
