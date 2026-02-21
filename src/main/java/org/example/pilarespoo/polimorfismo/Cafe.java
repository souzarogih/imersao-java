package org.example.pilarespoo.polimorfismo;

public class Cafe extends Bebida{
    @Override
    public void preparar(){
        System.out.println("Preparando um café");
        System.out.println("Coloca agua na chaleira");
        System.out.println("Coloca pó do cafe na chaleira");
        System.out.println("Coloca açucar na chaleira");
        System.out.println("Deixar ferver");
        System.out.println("Coar o cafe");
        System.out.println("Servir o cafe");
    }
}
