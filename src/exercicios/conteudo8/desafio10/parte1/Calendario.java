package exercicios.conteudo8.desafio10.parte1;

public class Calendario {

    static String obterNomeMes(int numeroMes) {
        String[] mesDoAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};

        return mesDoAno[numeroMes-1];
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(9);

        System.out.println(mes);
    }

}