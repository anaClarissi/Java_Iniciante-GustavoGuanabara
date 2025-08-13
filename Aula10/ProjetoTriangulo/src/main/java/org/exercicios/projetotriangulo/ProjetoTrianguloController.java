package org.exercicios.projetotriangulo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class ProjetoTrianguloController {

    @FXML
    public Slider slrValorSegmentoA, slrValorSegmentoB, slrValorSegmentoC;
    public Label lblResultadoSegmentoA, lblResultadoSegmentoB, lblResultadoSegmentoC;
    public Label lblResultadoTriangulo, lblResultadoTipoTriangulo;


    public void mudarValorDosegmentoA(){

        System.out.println("1");

    }


    public void mudarValorDosegmentoB(){



    }


    public void mudarValorDosegmentoC(){



    }


    public void verificarTriangulo(){

        System.out.println((int) slrValorSegmentoA.getValue());

    }

}
