package conteudo7.desafio75;

public class TelevisorResolvido {
    Integer canal = 130;
    Integer volume = 20;
// duas formas de resolução, ou passando o Integer pra int, ou tirando o comparativo de "==" para .equals
    void mudarCanal(Integer novoCanal) {
        if (canal.equals(novoCanal)) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (novoVolume.equals(volume)) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = Integer.valueOf(novoVolume.byteValue());
            System.out.println("Volume alterado para " + volume);
        }
    }
}
