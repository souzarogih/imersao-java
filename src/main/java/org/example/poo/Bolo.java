package org.example.poo;

public class Bolo {

    //Atributos da classe
    String sabor;
    int tamanho;
    String cor;

    //Construtor da classe
    public Bolo(String sabor, int tamanho ){
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    public Bolo(String sabor, String cor){
        this.sabor = sabor;
        this.cor = cor;
    }

    //Método da classe
    public void detalhesBolo(String sabor, int tamanho, String cor){
        System.out.println("Criando bolo de " + sabor + " com tamanho " + tamanho + " cor " + cor);
    }
}
