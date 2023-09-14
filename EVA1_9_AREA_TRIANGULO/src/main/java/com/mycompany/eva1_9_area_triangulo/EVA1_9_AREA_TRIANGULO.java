/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_9_area_triangulo;

import java.util.Scanner;
/**
 *
 * @author irism
 */
public class EVA1_9_AREA_TRIANGULO {

    public static void main(String[] args) {
        // double es el tipo real (para número con parte decimal)
        double base;
        double altura;
        double area;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Introduce la base del triángulo");
        base = captura.nextDouble();
        System.out.println("Introduce la altura del triángulo");
        altura = captura.nextDouble();
        
        area = (base * altura) / 2;
        
        System.out.println("El área de tu triángulo es:");
        System.out.println(area);
        
        
        
    }
}
