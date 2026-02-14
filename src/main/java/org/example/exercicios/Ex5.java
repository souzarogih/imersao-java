package org.example.exercicios;

public class Ex5 {
    public static void main(String[] args) {

        /*Sistema de Desconto*/

        double valorCompra = 250.0;
        boolean recebeuDesconto = false;

        if (valorCompra > 200) {
            double desconto = valorCompra * 0.10;
            valorCompra = valorCompra - desconto;
            recebeuDesconto = true;
        }

        System.out.println("Valor final da compra: " + valorCompra);
        System.out.println("Recebeu desconto? " + recebeuDesconto);

    }
}
