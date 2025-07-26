package exercicios.conteudo8.desafio20;

import java.util.Objects;

public class AulaVarargs {
    public static void main(String[] args) {
        Calculo calculo = new Calculo();

        calculo.calcularMedia(8.0, 2.0, 20.0);
    }
}

class Calculo {
    public void calcularMedia(Double numero1, Double numero2, Double... demaisNumeros){

        Objects.requireNonNull(numero1, "Obrigatório ao menos dois números");
        Objects.requireNonNull(numero2, "Obrigatório ao menos dois números");

        Double numeroTotal = numero1+numero2;
        for (int i = 0; i < demaisNumeros.length; i++) {
            numeroTotal = numeroTotal + demaisNumeros[i];
        }

        System.out.println("A média é: " + numeroTotal/(demaisNumeros.length+2));
    }
}