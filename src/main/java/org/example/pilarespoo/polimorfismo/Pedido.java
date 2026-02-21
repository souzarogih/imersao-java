package org.example.pilarespoo.polimorfismo;

public class Pedido {
    public static void main(String[] args) {
       Bebida cafe = new Cafe();
       Bebida cha = new Cha();

       cafe.preparar();
//       cha.preparar();

    }
}
