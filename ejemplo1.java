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
public class ejemplo1 {
    public static void main(String[] args) {
        //Se haace el llamado cada uno de los metodos creados
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
    }
    public static void metodoConVoid(){
        System.out.println("Contenido del metodo con void");
    }
    public static int metodoConInt(){
        System.out.println("Contenido del metodo con int");
        return 0;
    }
    public static double metodoConDouble(){
        System.out.println("Contenido del metodo con double");
        return 0.0;
    }
    public static String metodoConString(){
        System.out.println("Contenido del metodo con string");
        return "";
    }
    
}
