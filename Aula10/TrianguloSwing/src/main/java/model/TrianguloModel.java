package model;

import dto.TrianguloDTO;

public class TrianguloModel {

    private TrianguloDTO trianguloDTO;

    public TrianguloModel(TrianguloDTO trianguloDTO){

        this.trianguloDTO = trianguloDTO;

    }

    private boolean calcularTriangulo(){

        int segmentoA = trianguloDTO.getSegmentoA();
        int segmentoB = trianguloDTO.getSegmentoB();
        int segmentoC = trianguloDTO.getSegmentoC();

       if (segmentoA + segmentoB > segmentoC && segmentoA + segmentoC > segmentoB && segmentoB + segmentoC > segmentoA){

           return true;

       }

       return false;

    }

    public String mostrarTriangulo(){

        if (calcularTriangulo()){

            return "Forma um Triangulo";

        }

        return "Não forma um Triangulo";

    }

    public String mostrarTipoTriangulo(){

        if (!calcularTriangulo()){
            return "-";
        }

        int segmentoA = trianguloDTO.getSegmentoA();
        int segmentoB = trianguloDTO.getSegmentoB();
        int segmentoC = trianguloDTO.getSegmentoC();

        if (segmentoA == segmentoB && segmentoB == segmentoC){
            return "Equilátero";
        } else if (segmentoA == segmentoB || segmentoA == segmentoC || segmentoB == segmentoC) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }

    }



}
