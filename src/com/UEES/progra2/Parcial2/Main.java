package com.UEES.progra2.Parcial2;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Miguel Serrano", 1000.0);
        System.out.println("Ejecutando calculo de comisiones...");
        vendedor.mostrarDetalle();
    }
}