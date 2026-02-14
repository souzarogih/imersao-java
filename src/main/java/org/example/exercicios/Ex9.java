package org.example.exercicios;

public class Ex9 {
    public static void main(String[] args) {

        /*Sistema de Salário com Bônus*/

        double salario = 3000.0;
        int anosEmpresa = 6;

        if (anosEmpresa > 5) {
            salario = salario + (salario * 0.20);
        } else {
            salario = salario + (salario * 0.10);
        }

        System.out.println("Salário final: " + salario);

    }
}
