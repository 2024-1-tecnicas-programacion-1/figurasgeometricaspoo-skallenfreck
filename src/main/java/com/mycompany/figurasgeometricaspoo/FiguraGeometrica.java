package com.mycompany.figurasgeometricaspoo;

public abstract class FiguraGeometrica {
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public abstract double obtenerArea();
    
    public abstract double obtenerPerimetro();
}
