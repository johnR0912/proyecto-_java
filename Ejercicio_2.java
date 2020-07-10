/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author zc201
 */
public class Ejercicio_2 {
    
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         double europa, reinoUnido, australia, canada, dinero, USD, res1, res2, res3, res4, res5;
         
         USD = 1;
         europa = 0.70;
         reinoUnido = 0.61;
         australia = 0.95;
         canada =0.97;
         dinero = 100.00;
         
         res1 = (dinero * USD);
         res2 = (dinero * europa);
         res3 = (dinero * reinoUnido);
         res4 = (dinero * australia);
         res5 = (dinero * canada);
         
         System.out.println("Total de USD " + res1);
         System.out.println("Total de Europa " + res2);
         System.out.println("Total de ReinoUnido " + res3);
         System.out.println("Total de Australia " + res4);
         System.out.println("Total de Canadá " + res5);
         
         
    }
}
