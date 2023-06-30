/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg5.whilefordo.java;

/**
 *
 * @author anyel
 */
public class WhilefordoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
        System.out.println("nueros del 1 al 100");
        int i=1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
    int j=i;
    do{
        System.out.println(j);
        j++;
        
    }while (j<=100);
    
    System.out.println("nueros del 1 al 100 con FOR");
        for(int k=1; k<100; k++){
            System.out.println(k);
            
        }
    }
}