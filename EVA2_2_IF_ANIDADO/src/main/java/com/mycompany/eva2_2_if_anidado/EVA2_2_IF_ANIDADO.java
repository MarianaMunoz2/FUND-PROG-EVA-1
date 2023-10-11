package com.mycompany.eva2_2_if_anidado;
import java.util.Scanner;


public class EVA2_2_IF_ANIDADO {

    public static void main(String[] args) {
        
        int valor1, valor2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Valor 1: ");
        valor1 = input.nextInt();
        System.out.println("Valor 2: ");
        valor2 = input.nextInt();
        
        if(valor1 > valor2)//VERDAD                //concatenar
            System.out.println("El valor más grande es el " + valor1);
        else{ //FALSO, EL VALOR1 NO ES MÁS GRANDE QUE EL VALOR2
            //if anidado: un if dentro de otro if
            //En java, = es asignación y == es comparación
            if(valor1 == valor2) //VERDAD
                System.out.println("Ambos valores son iguales");
            else
                System.out.println("El valor más pequeño es " + valor1);
        }
    }
}
