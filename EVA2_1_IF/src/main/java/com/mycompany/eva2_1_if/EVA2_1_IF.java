
package com.mycompany.eva2_1_if;

public class EVA2_1_IF {

    public static void main(String[] args) {
        inf califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la calificación");
        califa = input.nextInt();
        
        if(califa >= 70) //if(expresion a evaluar)
            System,out.printl("Aprobaste");
        else     //esto se ejecuta si es falso
            System.out.println("No aprobaste");
    }
}
