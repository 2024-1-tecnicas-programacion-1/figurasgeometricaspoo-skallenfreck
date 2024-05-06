package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    
    public double obtenerArea(){
    double area=(base*altura)/2;
    return area;
    }
    
        public double obtenerPerimetro(){
            double hipotenusa=Math.sqrt(Math.pow(altura, 2)+Math.pow(base, 2));
            double perimetro= base+altura+hipotenusa;
            return perimetro;
        }
    
}
