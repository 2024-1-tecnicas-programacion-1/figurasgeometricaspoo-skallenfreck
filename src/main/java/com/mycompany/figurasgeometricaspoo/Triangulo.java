package com.mycompany.figurasgeometricaspoo;

/**
 * Clase Triangulo
 *
 * @author fresn
 */
public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    /**
     * Método constructor que inicializa los atributos de la clase
     *
     * @param base
     * @param altura
     * @param nombre
     * @param color
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Triangulo(double base, double altura, String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula el área de la figura geométrica
     *
     * @return area
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double obtenerArea() {
        double area = (base * altura) / 2;
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
        double hipotenusa = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
        double perimetro = base + altura + hipotenusa;
        return perimetro;
    }

}
