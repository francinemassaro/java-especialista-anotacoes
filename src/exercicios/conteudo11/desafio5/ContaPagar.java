package exercicios.conteudo11.desafio5;

public class ContaPagar {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isPendente() {
        return !isPago();
    }

    void pagar() {
        if (isPago()) {
            throw new RuntimeException("Não dá pra pagar uma conta que já foi paga");
        }
        pago = true;
    }

    void cancelarPagamento() {
        if (isPendente()) {
            throw new RuntimeException("Conta já está pendente de pagamento");
        }
        pago = false;
    }
}
