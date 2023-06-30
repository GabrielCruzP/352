/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg3.cajeroswitch;

import java.util.Scanner;

/**
 *
 * @author anyel
 */
public class CajeroSwitch {
   //Variables
        public static  int opcion,opcion2;
        public static double ingresodato,retiro,saldo;
        public static Scanner entrada = new Scanner(System.in);
   
    public static void main(String[] args) {
   Bucle();
    }
 public static void LecturaOpcion() {
    //Menu para ingresar opciones  
System.out.println("Depositar con 1");
System.out.println("Retirar con 2");
opcion = entrada.nextInt();
    }
 public static void Opciones()  {
     //Muestra el saldo antes del movimiento
System.out.println("Tu saldo es de " + saldo);
     //PROCESO DESPUES DE LA SELECCION DE OPCIONES PRECESO
 switch (opcion){
     case 1:  
     System.out.println("Ingresa monto del deposito");
    ingresodato = entrada.nextDouble();
    saldo =(saldo + ingresodato); 
    System.out.println("Tu saldo es de " + saldo);
     break;
  case 2:
   
        System.out.println("Ingresa monto del retiro");
      ingresodato = entrada.nextDouble();
  case 3:    
    if(ingresodato<=saldo){
        saldo =(saldo - ingresodato);
            System.out.println("Tu saldo es de " + saldo);
    }
    else
    {
     System.out.println("No saldo");   
    }
  
 }
 }
 public static void Bucle(){
  //Variable para bucle  
     int c=1; 
 //Bucle
     while(c==1){
         System.out.println("¿Quieres movimiento en tu cuenta?");
     
          System.out.println("Coloca 1 para SI////Coloca 2 para NO");
            opcion2=entrada.nextInt();
   if(opcion2 == 1)  
     {
         LecturaOpcion();
         Opciones();
     }
   else{
     System.out.println("Vuelva Pronto");  
     c++;
   }
     }
 }
}