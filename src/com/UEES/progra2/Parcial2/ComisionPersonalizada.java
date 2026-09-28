package com.UEES.progra2.Parcial2;

public class ComisionPersonalizada implements EstrategiaComision {

    // Miguel
    public static final int N = 6;

    @Override
    public double calcularComision(double montoVenta) {
        // (5+6) = 11%
        return montoVenta*0.11;
    }
}
