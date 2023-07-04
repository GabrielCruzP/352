/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg4.switchmenu;

import java.util.Scanner;

/**
 *
 * @author anyel
 */
public class SwitchMenu {

    /**
     * @param args the command line arguments
     */
    

        
          public static void main(String[] args) {
       int op, num = 0;
        while(num>=0){
        Scanner entrada = new Scanner(System.in);   
        System.out.println("1. Calificaciones");
        System.out.println("2. Descuento");
        System.out.println("3. Cajero");
        System.out.println("4. Salir");
        
        System.out.println("INGRESE NUMERO");
        op=entrada.nextInt();
            if (op>=4) {
                System.exit(0);
            }
        
        switch(op){
            case 1 -> calificaciones();
            case 2 -> descuento();
            case 3 -> cajero();
            case 4 -> salir();
           default -> System.out.println("Error");  
        
        }
        }
    }
    
    
    
    
    public static void calificaciones(){
        // Obtener la calificación del usuario.
        Scanner entrada = new Scanner(System.in);
                System.out.println("BIENVENIDO A CALIFICACIONES");
        System.out.println("INGRESE SU CALIFICACION: ");
        int calificacion;
        calificacion = entrada.nextInt();
        
        // Calcular la calificación.
        
        switch (calificacion) {
            
            case 0 -> System.out.println("MUY MALA");
            case 1, 2, 3, 4, 5 -> System.out.println("INSUFICIENTE");
            case 6 -> System.out.println("SUFICIENTE");
            case 7 -> System.out.println("APROBADO");
            case 8 -> System.out.println("BIEN");
            case 9 -> System.out.println("BUENO");
            case 10 -> System.out.println("EXELENTE");
            default -> System.out.println("CALIFICACION NO VALIDA");
        }   
        }
    
    
    
    public static void descuento(){
             //DESCUENTOS   
       
                 Scanner scanner = new Scanner(System.in);
        
        // Obtener el precio del producto.
            System.out.println("BIENVENIDO A DESCUENTOS");
        System.out.println("INTRODUZCA EL PRECIO DEL PRODUCTO: ");
        
        // Obtener el código de descuento del usuario.
        
        System.out.println("INTRODUZCA EL CODIGO DE DESCUENTO: ");
        String códigodescuento = scanner.nextLine();
        
       // Calcular el descuento.
        double descuento = 0;
        switch (códigodescuento) {
            case "10" -> descuento = 10;
            case "20" -> descuento = 20;
            case "30" -> descuento = 30;
            case "40" -> descuento = 40;
            case "50" -> descuento = 50;
            case "60" -> descuento = 60;
            case "70" -> descuento = 70;
            case "80" -> descuento = 80;
            case "90" -> descuento = 90;
            case "100" -> descuento = 100;
            default -> System.out.println("CODIGO DE DESCUENTO NO VALIDO.");
        }
        // Imprime el descuento.
        System.out.println("SU DESCUENTO ES DEL: " + descuento + "%.");
    }
         
         
         
         
         
         
    public static void cajero(){
             //CAJERO
             Scanner entrada = new Scanner(System.in);
        //variables 
        final int saldo_inicial=1000;
        int opcion;
        double ingreso,saldoActual,retiro;
            System.out.println("BIENVENIDOS A CAJERO");
        System.out.println("1. INGRESAR DINERO");
        System.out.println("2. RETIRAR DINERO");
        System.out.println("3. SALIR");
        
        System.out.println("INGRESAR UN NUMERO");
        opcion=entrada.nextInt();
        
        switch (opcion){
            case 1 -> {
                System.out.println("DIGITE LA CANTIDAD QUE DESEA INGRESAR");
                ingreso=entrada.nextInt();
                saldoActual=saldo_inicial+ingreso;
                System.out.println("EL ESTADO ACTUAL ES: " + saldoActual);
                  }
            case 2 -> {
                System.out.println("DIGITE LA CANTIDAD QUE DESEA RETIRAR ");
                retiro=entrada.nextInt();
                if(retiro<=saldo_inicial){
                    saldoActual=saldo_inicial-retiro;
                    System.out.println("USTED TIENE: " + saldoActual);
                }
                else{
                    System.out.println("NO CUENTA CON EL SUFUCIENTE DINERO");
                } }
                
                 default -> System.out.println("Error");
         }
         }
    
    
    
    
    public static void salir(){
        System.out.println("Saliendo...");
        System.out.println("Hasta pronto");
    }
    }