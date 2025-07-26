package exercicios.conteudo5.desafio35;

public class FormulaMatematica {

    static double areaQuadrado(Quadrado quadrado) {
        return (quadrado.lado)*(quadrado.lado);
    }

    static double areaCirculo(Circulo circulo) {
        return (circulo.raio*circulo.raio)*Circulo.pi;
    }
}
