package com.mycompany.figurasgeometricaspoo;

/**
 * Clase FiguraGeometrica
 *
 * @author fresn
 */
public abstract class FiguraGeometrica {

    private String nombre;
    private String color;

    /**
     * Método constructor que inicializa los atributos de la clase
     *
     * @param nombre
     * @param color
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Método abstracto que calcula el area de la figura geométrica
     *
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public abstract double obtenerArea();

    /**
     * Método abstracto que calcula el perímetro de la figura geométrica
     *
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public abstract double obtenerPerimetro();
}
