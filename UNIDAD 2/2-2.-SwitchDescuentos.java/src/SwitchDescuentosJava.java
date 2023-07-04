import java.util.Scanner;
import java.io.*;
/**
 *

 */
public class SwitchDescuentosJava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
     public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        // Obtener el precio del producto.
        
        System.out.println("Introduzca el precio del producto:");
        
        // Obtener el código de descuento del usuario.
        
        System.out.println("Introduzca el descuento:");
        String códigodescuento = scanner.nextLine();
        
       // se calcula el descuento.
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
            default -> System.out.println("no existe descuento");
        }
        // se imprime el descuento.100
        System.out.println("su descuento es del: " + descuento );
    }
}