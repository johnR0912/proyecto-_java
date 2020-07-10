/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author zc201
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        NumberFormat formato = new DecimalFormat ("#0.00");
        double r1, r2, r3, r4, req, den;
        
        System.out.println("Ingrese el valor 1");
        r1 = leer.nextDouble();
        System.out.println("Ingrese el valor 2");
        r2 = leer.nextDouble();
        System.out.println("Ingrese el valor 3");
        r3 = leer.nextDouble();
        System.out.println("Ingrese el valor 4");
        r4 = leer.nextDouble();
        
        den = (1/r1) + (1/r2) + (1/r3) + (1/r4);
        
        req = 1/den;
        System.out.println("Resultado del denominador :" + formato.format (req)+ "ohm");
    }
    
}
