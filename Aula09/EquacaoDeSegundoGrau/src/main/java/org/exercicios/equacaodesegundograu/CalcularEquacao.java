package org.exercicios.equacaodesegundograu;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class CalcularEquacao {

    @FXML
    public Spinner<Integer> txtVariavelAdigitadaPeloUsuario, txtVariavelBdigitadaPeloUsuario,txtVariavelCdigitadaPeloUsuario;
    public Label lblVariavelA, lblVariavelB, lblVariavelC;
    public Label lblDeltaDoSistema, lblTipoDoSistema;
    public Label lblResultadoDoDelta,lblTipoDaRaiz;
    public Label lblResultadoDaEquacao;

    @FXML
    public void initialize(){

        SpinnerValueFactory<Integer> valueFactoryA = new SpinnerValueFactory.IntegerSpinnerValueFactory(-999999999, 999999999, 0);
        SpinnerValueFactory<Integer> valueFactoryB = new SpinnerValueFactory.IntegerSpinnerValueFactory(-999999999, 999999999, 0);
        SpinnerValueFactory<Integer> valueFactoryC = new SpinnerValueFactory.IntegerSpinnerValueFactory(-999999999, 999999999, 0);

        txtVariavelAdigitadaPeloUsuario.setValueFactory(valueFactoryA);
        txtVariavelBdigitadaPeloUsuario.setValueFactory(valueFactoryB);
        txtVariavelCdigitadaPeloUsuario.setValueFactory(valueFactoryC);

        lblDeltaDoSistema.setVisible(false);
        lblTipoDoSistema.setVisible(false);
        lblResultadoDoDelta.setVisible(false);
        lblTipoDaRaiz.setVisible(false);

    }

    @FXML
    public void mudarValorDaVariavelA(){

        lblVariavelA.setText(txtVariavelAdigitadaPeloUsuario.getValue().toString());

    }

    @FXML
    public void mudarValorDaVariavelB(){

        lblVariavelB.setText(txtVariavelBdigitadaPeloUsuario.getValue().toString());

    }

    @FXML
    public void mudarValorDaVariavelC(){

        lblVariavelC.setText(txtVariavelCdigitadaPeloUsuario.getValue().toString());

    }

    @FXML
    public void calcularEquacaoDoSegundoGrau() {

        int variavelA = Integer.parseInt(lblVariavelA.getText());
        int variavelB = Integer.parseInt(lblVariavelB.getText());
        int variavelC = Integer.parseInt(lblVariavelC.getText());

        float delta = (variavelB * variavelB) - (4 * variavelA * variavelC);
        String tipoDoDelta;

        if (delta < 0) {

            tipoDoDelta = "Não existe raizes reais";

        } else {

            tipoDoDelta = "Exixtem raizes reais";

        }

        lblResultadoDoDelta.setText(String.format("%.2f", delta));
        lblDeltaDoSistema.setVisible(true);
        lblResultadoDoDelta.setVisible(true);

        lblTipoDaRaiz.setText(tipoDoDelta);
        lblTipoDoSistema.setVisible(true);
        lblTipoDaRaiz.setVisible(true);


    }

}
