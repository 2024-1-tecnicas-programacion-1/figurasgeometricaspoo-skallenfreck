package com.mycompany.figurasgeometricaspoo;

public class TrianguloIsoceles extends FiguraGeometrica {

    private double baseDos;
    private double alturaDos;
    private double lado;

    public TrianguloIsoceles(double base, double altura, double lado, String nombre, String color) {
        super(nombre, color);
        this.baseDos = base;
        this.alturaDos = altura;
        this.lado = lado;
    }
    
    public double obtenerArea() {
        double area=baseDos*alturaDos/2;
        return area;
    }

    
    public double obtenerPerimetro() {
        double perimetro=2*lado+baseDos;
        return perimetro;
    }

}
