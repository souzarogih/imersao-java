package org.example.pilarespoo.polimorfismo;

public class Cha extends Bebida{
    @Override
    public void preparar(){
        System.out.println("Preparando um chá");
        System.out.println("Colocar agua no fogo");
        System.out.println("Colocar as folhas do chá");
        System.out.println("Espera ferver");
        System.out.println("Servir o chá");
    }
}
