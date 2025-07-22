package conteudo7.desafio75;

public class Principal {
    public static void main(String[] args) {
        TelevisorResolvido tv = new TelevisorResolvido();

        // Não deveria mudar o volume e canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);

        // Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }
}
