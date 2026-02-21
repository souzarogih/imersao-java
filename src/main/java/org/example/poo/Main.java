package org.example.poo;

public class Main {
    public static void main(String[] args) {
        String categoria = "Refrigerante";
        String nome = "Coca cola";
        double preco = 12.50;
        double desconto = 2.0;
        Produto produto = new Produto(nome, preco, categoria);
        produto.detalhes();
        double valorDesconto = produto.aplicarDesconto(desconto);
        System.out.println(valorDesconto);
        produto.detalhes();

//        produto.preco = 100.00;
//        produto.categoria = "Fanta";
        produto.detalhes();

    }
}
