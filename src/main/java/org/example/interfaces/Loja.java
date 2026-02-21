package org.example.interfaces;

public class Loja {
    public static void main(String[] args) {
        Pagamento pagamentoPix = new PagamentoPix();
        Pagamento pagamentoCartao = new PagamentoCartao();

        pagamentoPix.processarPagamento(50.00);
        pagamentoCartao.processarPagamento(100.00);
    }
}
