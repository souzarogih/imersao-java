package org.example.interfaces;

public class PagamentoPix implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Procesando pagamento de " + valor + " com Pix");
    }
}
