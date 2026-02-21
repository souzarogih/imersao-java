package org.example.pilarespoo.abstracao;

abstract class MaquinaDeCafe {

    abstract void prepararCafe();

    public void iniciar(){
        System.out.println("Ligando maquina de cafe");
    }
}
