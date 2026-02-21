package org.example.pilarespoo.encapsulamento;

public class Cafe {
    private String tipo;
    private double temperatura;

    public Cafe(String tipo, double temperatura) {
        this.tipo = tipo;
        this.temperatura = temperatura;
    }

    public Cafe() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
