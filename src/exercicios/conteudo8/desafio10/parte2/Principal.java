package exercicios.conteudo8.desafio10.parte2;

public class Principal {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Tofu 500g";
        item1.preco = 30;

        ItemCardapio item2 = new ItemCardapio();
        item2.descricao = "Proteína de soja 400g";
        item2.preco = 50.5;

        ItemCardapio item3 = new ItemCardapio();
        item3.descricao = "Batata frita 300g";
        item3.preco = 12;

        cardapio.adicionarItem(item1);
        cardapio.adicionarItem(item2);
        cardapio.adicionarItem(item3);

        cardapio.imprimirItensCardapio(80, 150);

        cardapio.removerItem(0);
        System.out.println("---");

        cardapio.imprimirItensCardapio(0, 150);
    }

}
