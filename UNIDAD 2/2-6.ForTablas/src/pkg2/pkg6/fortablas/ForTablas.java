/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg6.fortablas;

/**
 *
 * @author anyel
 */
public class ForTablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
int i, j; 
       for(i=1; i<=10; i++)
       {
           System.out.println("Tabla del "+ i);
           System.out.println("--------");
           
           for (j=1; j<=10; j++)
           {
               System.out.println(i + "X" + j + "=" + j*i);
           }
       }
    }
}