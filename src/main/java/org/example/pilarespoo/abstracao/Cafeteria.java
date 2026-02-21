package org.example.pilarespoo.abstracao;

public class Cafeteria {
    public static void main(String[] args) {
        Expresso cafeExpresso = new Expresso();
        cafeExpresso.prepararCafe();
        cafeExpresso.iniciar();
    }
}
