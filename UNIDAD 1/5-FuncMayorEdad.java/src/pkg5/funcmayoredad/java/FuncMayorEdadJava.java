/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.funcmayoredad.java;
import java.util.Scanner;
/**
 *
 * @author anyel
 */
public class FuncMayorEdadJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Declaracion de variables
        Scanner Entrada = new Scanner (System.in);
        int numero;
        //procesamiento de datos 
        System.out.print(" ingresa tu edad ");
        numero = Entrada.nextInt();
        //Salida de datos 
        System.out.println(retornaEdad(numero));
    }
    public static String retornaEdad(int numero){
        
        if (numero >=18){
            System.out.println("Eres mayor de edad ");
        } else if (numero<18){
            System.out.println("Eres menor de edad ");
        }
      
      return "Este es tu caso";
      
    }
    
}
