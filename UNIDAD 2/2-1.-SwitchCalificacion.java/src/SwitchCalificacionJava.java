import java.io.*;
import java.util.Scanner;

/**
 *
 * @author badhi
 */
public class SwitchCalificacionJava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
     public static void main(String[] args)throws IOException{

                //definir variables
                Scanner entrada = new Scanner(System.in);
        int calificacion;
        
        //datos de entrada 
        System.out.println("introduzca la calificacion:");
        calificacion = entrada.nextInt();
        //proceso (operación matemática)
        //datos salida
        switch (calificacion){
            case 0 -> System.out.println ("MUY MAL");
            case 1, 2, 3, 4, 5 -> System.out.println("INSUFICIENTE");
            case 6 -> System.out.println("SUFICIENTE");
            case 7, 8 -> System.out.println("BIEN");
            case 9 -> System.out.println("NOTABLE");
            case 10 -> System.out.println("SOBRESALIENTE");
            default -> System.out.println("EEROR DE CAIFICACIÓN");
        }

    }

}