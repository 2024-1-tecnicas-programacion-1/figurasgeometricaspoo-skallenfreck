package com.mycompany.figurasgeometricaspoo;

/**
 * Clase Rectangulo
 *
 * @author fresn
 */
public class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;

    /**
     * Método constructor que inicializa los atributos de la clase
     *
     * @param lado1
     * @param lado2
     * @param nombre
     * @param color
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Rectangulo(double lado1, double lado2, String nombre, String color) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Método que calcula el área de la figura geométrica
     *
     * @return area
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerArea() {
        double area = lado1 * lado2;
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
        double perimetro = (2 * lado1 + 2 * lado2);
        return perimetro;
    }

}
