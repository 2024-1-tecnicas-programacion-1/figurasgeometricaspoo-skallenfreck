package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio, String nombre, String color) {
        super(nombre, color);
        this.radio = radio;
    }

    public double obtenerArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    public double obtenerPerimetro(){
        double perimetro=(Math.PI*2)*radio;
        return perimetro;
    }
}
