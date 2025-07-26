package exercicios.conteudo8.curiosidade;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Argumentos passados na classe = " + Arrays.toString(args));

        /*
        Na classes main, String[] args recebem argumentos no array, que podem ser passsados tanto por linha de comando
        rodando a classe principal 'java Principal en Fran', tanto pela configuração do projeto em Program arguments.

        */

        if(args.length <= 1) {
            System.out.printf("Use: java %s [pt|en] [seu nome]", Principal.class.getName());
        } else if (args[0].equals("en")){
            System.out.printf("Hello, %s", args[1]);
        } else if (args[0].equals("pt")) {
            System.out.printf("Olá, %s", args[1]);
        }
    }
}
