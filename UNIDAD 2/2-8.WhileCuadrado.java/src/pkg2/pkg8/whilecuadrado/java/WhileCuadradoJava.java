/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg8.whilecuadrado.java;

import java.util.Scanner;

/**
 *
 * @author anyel
 */
public class WhileCuadradoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
     int num, cuadrado;
     
     System.out.println("INTRODUZCA EL NUMERO");
     num= entrada.nextInt();
     while (num>=0){
         cuadrado =num *num;
         System.out.println("el cuadrado de "+ num+" es igual a"+ cuadrado);
         
         System.out.println("");
         System.out.println("introduzca otro numero");
         num=entrada.nextInt();
     }
    }
    
}