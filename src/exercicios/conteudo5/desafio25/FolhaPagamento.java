package exercicios.conteudo5.desafio25;

public class FolhaPagamento {
 /*O método calcularSalario deve receber os seguintes parâmetros para calcular o valor total do salário a pagar:

Quantidade de horas normais trabalhadas
Quantidade de horas extras trabalhadas
Valor da hora normal
Valor da hora extra*/

    double calcularSalario(ContratoTrabalho contrato) {
        double totalHoraExtra = calculoHoraExtra(contrato.qtdHorasExtras,
                contrato.qtdHorasExtras);

        double totalHoraNormal = calculoHoraComum(contrato.qtdHorasTrabalhadas,
                contrato.valorHora);

        double salario = totalHoraNormal + totalHoraExtra;

        if(contrato.funcionario.quantidadeFilhos > 0) {
            salario = calculoAdicionalFilho(salario);
        }

        return salario;
    }

    double calculoHoraExtra(int qtdHoraExtra, double valorHoraExtra){
        return qtdHoraExtra*valorHoraExtra;
    }

    double calculoHoraComum(int qtdHora, double valorHora){
        return qtdHora*valorHora;
    }

    double calculoAdicionalFilho(double salario) {
        return salario * 1.1;
    }
}
