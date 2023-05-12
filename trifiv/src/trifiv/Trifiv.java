/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trifiv;

import java.util.Scanner;
/**
 *
 * @author anyel
 */
public class Trifiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO");
        int num= sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("TriFiv");
        }else if(num % 3 ==0){
            System.out.println("Tri");
                }else if (num % 5 == 0) {
        System.out.println("Fiv");
}else{
                System.out.println("El numero no es multiplo de 3 ni de 5");
                }
    }   
    
}
