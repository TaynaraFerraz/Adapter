package org.example;

public class Pedido {

    IPagamento pagamento;
    PagamentoAdapter gateway;

    public Pedido() {
        pagamento = new PagamentoReais();
        gateway = new PagamentoAdapter(pagamento);
    }

    public void setValor(double valor) {
        pagamento.setValor(valor);
        gateway.enviarParaGateway();
    }

    public double getValor() {
        return gateway.recuperarValor();
    }

    // Metodo apenas para mostrar que está convertendo reais para centavos através do adaptador
    public int getValorCentavos() {
        return gateway.getValorCentavos();
    }
}
