/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg10.doacumulador;

import java.util.Scanner;

/**
 *
 * @author anyel
 */
public class DoAcumulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner  entrada= new Scanner(System.in);
      int num,suma;
      suma=0;
      do{
          System.out.println("Introduzca el numero: ");
          num= entrada.nextInt();
          suma= suma + num;
      }while(num!=0);
      
        System.out.println("La suma de todo es: "+ suma);
    }
    
}