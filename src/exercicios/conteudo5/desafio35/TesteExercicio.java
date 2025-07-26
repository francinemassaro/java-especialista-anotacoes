package exercicios.conteudo5.desafio35;

public class TesteExercicio {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado();
        quadrado1.lado = 24;

        Circulo circulo1 = new Circulo();
        circulo1.raio = 9;

        double areaQuadrado = FormulaMatematica.areaQuadrado(quadrado1);
        double areaCirculo = FormulaMatematica.areaCirculo(circulo1);

        System.out.println("Area do quadrado é: " + areaQuadrado);
        System.out.println("Area do quadrado é: " + areaCirculo);
    }
}
