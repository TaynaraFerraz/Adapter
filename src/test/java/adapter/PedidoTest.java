package adapter;

import org.example.Pedido;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {

    @Test
    void deveRetornarValorReaisPedido() {
        Pedido pedido = new Pedido();
        pedido.setValor(49.90);

        assertEquals(49.90, pedido.getValor());
    }

    @Test
    void deveRetornarValorCentavosPedido() {
        Pedido pedido = new Pedido();
        pedido.setValor(49.90);

        assertEquals(4990, pedido.getValorCentavos());
    }

}
