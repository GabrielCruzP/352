/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.v1trifiv.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author anyel
 */
public class V1TRIFIVJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //Declaracion de variables
          int numero;
          int mult3;
          int mult5;
          BufferedReader buffEntrada = new BufferedReader(new InputStreamReader (System.in));
        //Entrada de datos
          System.out.println("Dame el numero");
          numero = Integer.parseInt(buffEntrada.readLine());
        //Procesamiento de datos
          mult3 = numero % 3;
          mult5 = numero % 5;
        //Salida de datos
            if(mult3 == 0){System.out.println("Tri");}
            if(mult5 == 0){System.out.println("Friv");}
            if(mult3 == 0 && mult5 == 0){System.out.println("Imprime TriFiv");}
    }
    
}
