/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplosguia2;

/**
 *
 * @author zc201
 */
public class ejemplo3 {
    public static void main(String[] args) {
        double cantidadPrestada, tiempo, tasaDeInteres;
        cantidadPrestada = 1500.00;
        tiempo = 0.75; //9 meses equivale a 9/12 años = 2/4 ó 0,75
        tasaDeInteres = 0.08;
        //Envio de parametros al metodo
        double valorInteresSimple = calcularInteresSimple(cantidadPrestada, tiempo, tasaDeInteres);
        System.out.println("El interes es: $" + valorInteresSimple); //Muestra el resultado
    }
    public static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeInteres){
        double interesSimple;
        interesSimple = cantidadPrestada * tiempo * tasaDeInteres; //Efectua la operacion dentro del metodo 
    return interesSimple;
    }
}
