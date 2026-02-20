package org.example.poo;

public class Produto {
    //Atributos da classe
    String nome;
    double preco;
    String categoria;

    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Produto(String nome, String categoria){
        this.nome = nome;
        this.categoria = categoria;
    }

    public void detalhes(){
        System.out.println("Nome do produto: " + nome + " preco " + preco + " categoria " + categoria);
    }

    public double aplicarDesconto(double valorDesconto){
        double valorComDesconto = this.preco - valorDesconto;
        System.out.println("Valor com desconto: " + valorComDesconto);
        return valorComDesconto;
    }

}
