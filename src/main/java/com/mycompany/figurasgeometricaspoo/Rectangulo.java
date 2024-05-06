package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2, String nombre, String color) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double obtenerArea() {
        double area = lado1 * lado2;
        return area;
    }
    
    public double obtenerPerimetro(){
    double perimetro= (2*lado1+2*lado2);
    return perimetro;
    }

}
