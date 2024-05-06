package com.mycompany.figurasgeometricaspoo;

/**
 * Clase TrianguloIsoceles
 *
 * @author fresn
 */
public class TrianguloIsoceles extends FiguraGeometrica {

    private double baseDos;
    private double alturaDos;
    private double lado;

    /**
     * Método constructor que inicializa los atributos de la clase
     *
     * @param base
     * @param altura
     * @param lado
     * @param nombre
     * @param color
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public TrianguloIsoceles(double base, double altura, double lado, String nombre, String color) {
        super(nombre, color);
        this.baseDos = base;
        this.alturaDos = altura;
        this.lado = lado;
    }

    /**
     * Método que calcula el área de la figura geométrica
     *
     * @return area
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerArea() {
        double area = baseDos * alturaDos / 2;
        return area;
    }

    /**
     * Método que calcula el perímetro de la figura geométrica
     *
     * @return perimetro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerPerimetro() {
        double perimetro = 2 * lado + baseDos;
        return perimetro;
    }

}
