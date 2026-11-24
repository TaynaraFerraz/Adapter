package org.example;

public class PagamentoAdapter extends GatewayLegado {

    private IPagamento pagamento;

    public PagamentoAdapter(IPagamento pagamento) {
        this.pagamento = pagamento;
    }

    // Converte reais -> centavos e grava no gateway legado
    public void enviarParaGateway() {
        int centavos = (int) Math.round(pagamento.getValor() * 100);
        this.setValorCentavos(centavos);
    }

    // Converte centavos (legado) -> reais e devolve ao sistema novo
    public double recuperarValor() {
        double reais = this.getValorCentavos() / 100.0;
        pagamento.setValor(reais);
        return pagamento.getValor();
    }
}
