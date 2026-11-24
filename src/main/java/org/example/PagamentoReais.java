package org.example;

public class PagamentoReais implements IPagamento {

    private double valor;

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
}
