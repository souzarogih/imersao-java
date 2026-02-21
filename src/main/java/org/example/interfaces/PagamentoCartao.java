package org.example.interfaces;

public class PagamentoCartao implements Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Procesando pagamento de " + valor + " com Cartao");
    }
}
