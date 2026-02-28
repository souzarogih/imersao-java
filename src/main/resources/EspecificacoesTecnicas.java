package org.example.ecommerce.produtos;

public class EspecificacoesTecnicas {
    private double peso;
    private double altura;
    private double largura;
    private String cor;

    public EspecificacoesTecnicas(double peso, double altura, double largura, String cor) {
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
