package exercicios.conteudo5.desafio41;

public class NumeroUtil {

    public static void maiorNumero(int a, int b){
        int maiorNumeroInt;

        if(a>b){
            maiorNumeroInt = a;
        }
        else {
            maiorNumeroInt = b;
        }

        System.out.println("O maior numero entre " + a + " e " + b + " é: " + maiorNumeroInt);
    }

    public static void maiorNumero(int a, int b, int c){
        int maiorNumeroInt;
        int aux;

        if(a>b){
           aux = a;
        } else {
            aux = b;
        }

        if(aux>c){
            maiorNumeroInt = aux;
        } else {
            maiorNumeroInt = c;
        }
        System.out.println("O maior numero entre " + a + " e " + b + " e " + c + " é: " + maiorNumeroInt);
    }

    public static void maiorNumero(double a, double b){
        double maiorNumeroDouble;

        if(a>b){
            maiorNumeroDouble = a;
        }
        else {
            maiorNumeroDouble = b;
        }
        System.out.println("O maior numero entre " + a + " e " + b + " é: " + maiorNumeroDouble);
    }

    public static void maiorNumero(double a, double b, double c){
        double maiorNumeroDouble;
        double aux;

        if(a>b){
            aux = a;
        } else {
            aux = b;
        }

        if(aux>c){
            maiorNumeroDouble = aux;
        } else {
            maiorNumeroDouble = c;
        }
        System.out.println("O maior numero entre " + a + " e " + b + " e " + c + " é: " + maiorNumeroDouble);
    }
}
