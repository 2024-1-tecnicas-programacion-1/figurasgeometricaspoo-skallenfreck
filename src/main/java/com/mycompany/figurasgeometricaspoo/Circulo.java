package com.mycompany.figurasgeometricaspoo;

/**
 * Clase Circulo
 *
 * @author fresn
 */
public class Circulo extends FiguraGeometrica {

    private double radio;

    /**
     * Método constructor que inicializa los atributos de la clase
     *
     * @param radio
     * @param nombre
     * @param color
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Circulo(double radio, String nombre, String color) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Método que calcula el área de la figura geométrica
     *
     * @return area
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerArea() {
        double area = Math.PI * Math.pow(radio, 2);
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
        double perimetro = (Math.PI * 2) * radio;
        return perimetro;
    }
}
