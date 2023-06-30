/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg7.forfactorial.java;

import java.util.Scanner;

/**
 *
 * @author anyel
 */
public class ForFactorialJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double factorial;
        int num;
        System.out.println("INTRODUCE EL NUMERO:");
        num = entrada.nextInt();
        factorial = 1;
        for(int i=num; i > 0; i--){
        factorial=factorial*i;
        
    }
     System.out.println("el factorial de "+ factorial);
    }
    
}
