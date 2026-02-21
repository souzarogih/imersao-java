package org.example.pilarespoo.abstracao;

public class Expresso extends MaquinaDeCafe{
    @Override
    void prepararCafe() {
        System.out.println("Preparar um cafe expresso.");
    }
}
