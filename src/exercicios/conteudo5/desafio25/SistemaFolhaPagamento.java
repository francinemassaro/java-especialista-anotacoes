package exercicios.conteudo5.desafio25;

public class SistemaFolhaPagamento {
    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ContratoTrabalho contrato = new ContratoTrabalho();
        Funcionario felipe = new Funcionario();

        felipe.nome = "Felipe Rogerio";
        felipe.quantidadeFilhos = 0;

        contrato.qtdHorasExtras = 10;
        contrato.valorHora = 60;
        contrato.qtdHorasTrabalhadas = 200;
        contrato.valorHora = 30;
        contrato.funcionario = felipe;

        double salario = folhaPagamento.calcularSalario(contrato);

        System.out.printf("Salário do funcionário %s nesse mês é de R$: %.2f", contrato.funcionario.nome, salario);
    }
}
