<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricaspoo;

/**
 *
 * @author fresn
 */
public class Principal {
    
=======
package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura");
        String nombre = sc.next();
        System.out.println("Ingrese el color de la figura");
        String color = sc.next();
        System.out.println("Ingrese el tipo de figura por medio de su numero "
                + "determinado");
        System.out.println("1: Circulo");
        System.out.println("2: Rectángulo");
        System.out.println("3: Triángulo");
        char figura = sc.next().charAt(0);
        switch (figura) {
            case '1':
                System.out.println("Ingrese el radio del círculo");
                double radio=sc.nextDouble();
                Circulo circuloUno= new Circulo(radio, nombre, color);
                System.out.println("El area de "+nombre+" es: "+circuloUno.obtenerArea());
                System.out.println("El perimetro de "+nombre+ " es: "+circuloUno.obtenerPerimetro());
                break;
            case '2':
                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                double lado1=sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                double lado2=sc.nextDouble();
                Rectangulo rectanguloUno=new Rectangulo(lado1, lado2, nombre, color);
                System.out.println("El area de "+nombre+" es: "+rectanguloUno.obtenerArea());
                System.out.println("El perimetro de "+nombre+ " es: "+rectanguloUno.obtenerPerimetro());
                break;
            case '3':
                System.out.println("Ingrese el valor de la base del triángulo");
                double base=sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo");
                double altura=sc.nextDouble()   ;
                Triangulo trianguloUno= new Triangulo(base, altura, nombre, color);
                System.out.println("El area de "+nombre+" es: "+trianguloUno.obtenerArea());
                System.out.println("El perimetro de "+nombre+ " es: "+trianguloUno.obtenerPerimetro());
                break;
            default:
        }

    }
>>>>>>> Stashed changes
}
