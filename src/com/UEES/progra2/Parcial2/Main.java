package com.UEES.progra2.Parcial2;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Miguel Serrano", 1000.0);
        //Se asigna ComisionPersonalizada - paso 3, punto 2
        vendedor.cambiarEstrategia(new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}