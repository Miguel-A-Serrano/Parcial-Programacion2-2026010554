package com.UEES.progra2.Parcial2;

public class Vendedor extends Empleado{

    //Constructor por defecto de la rama main - paso 3 punto 1
    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    //Constructor tradicional del patron strategy
    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }
    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(this.ventasMes);
        System.out.println("Empleado: " + this.nombre);
        System.out.printf("Ventas del Mes: $%.2f%n", this.ventasMes);
        System.out.printf("Comisión Obtenida: $%.2f%n", comision);

    }
}
