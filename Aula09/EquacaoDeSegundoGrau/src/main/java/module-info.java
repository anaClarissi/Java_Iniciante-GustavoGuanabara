module org.exercicios.equacaodesegundograu {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.exercicios.equacaodesegundograu to javafx.fxml;
    exports org.exercicios.equacaodesegundograu;
}