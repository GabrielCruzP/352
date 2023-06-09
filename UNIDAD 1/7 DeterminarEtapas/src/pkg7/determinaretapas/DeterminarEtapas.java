/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.determinaretapas;

import java.util.Scanner;
/**
 *
 * @author anyel
 */
public class DeterminarEtapas {
static int edad=0;
   
    public static void main(String[] args) {
        pedirDatos();
        calculoEdad(edad);
        
    }
    public static void pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la edad: ");
        edad = entrada.nextInt();
    }
    
    public static void calculoEdad(int edad){
        if (edad<5) {
            System.out.println("Infante");
        }else if (edad<18) {
            System.out.println("Niño");
        }else if (edad>=18) {
            System.out.println("Adulto");
        }else{
            System.out.println("No exite esa edad");
        }
        }
}
