import java.util.Scanner;

public class JuegoGato {
    private static final char[] tablero = new char[9];
    private static char jugadorActual = 'X';

    public static void main(String[] args) {
        inicializarTablero();
        boolean juegoTerminado = false;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¡Bienvenido al juego de gato!");
            
            while (!juegoTerminado) {
                dibujarTablero();
                System.out.println("Ronda del jugador " + jugadorActual);
                System.out.print("Ingresa el número de casilla (1-9): ");
                int casilla = scanner.nextInt() - 1;
                
                if (movimientoValido(casilla)) {
                    realizarMovimiento(casilla);
                    if (hayGanador()) {
                        dibujarTablero();
                        System.out.println("¡Jugador " + jugadorActual + " haz ganado!");
                        juegoTerminado = true;
                    } else if (tableroLleno()) {
                        dibujarTablero();
                        System.out.println("¡Empate!");
                        juegoTerminado = true;
                    } else {
                        cambiarJugador();
                    }
                } else {
                    System.out.println("Accion inválida. Intentalo de nuevo.");
                }
            }
            
            System.out.println("¡Gracias por jugar!");
        }
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 9; i++) {
            tablero[i] = ' ';
        }
    }

    private static void dibujarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("| " + tablero[i] + " | " + tablero[i + 1] + " | " + tablero[i + 2] + " |");
            System.out.println("-------------");
        }
    }

    private static boolean movimientoValido(int casilla) {
        return casilla >= 0 && casilla < 9 && tablero[casilla] == ' ';
    }

    private static void realizarMovimiento(int casilla) {
        tablero[casilla] = jugadorActual;
    }

    private static void cambiarJugador() {
        if (jugadorActual == 'X') {
            jugadorActual = 'O';
        } else {
            jugadorActual = 'X';
        }
    }

    private static boolean hayGanador() {
        // Verificar filas
        for (int i = 0; i < 9; i += 3) {
            if (tablero[i] == jugadorActual && tablero[i + 1] == jugadorActual && tablero[i + 2] == jugadorActual) {
                return true;
            }
        }

        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i] == jugadorActual && tablero[i + 3] == jugadorActual && tablero[i + 6] == jugadorActual) {
                return true;
            }
        }
        // Verificar diagonales

        return (tablero[0] == jugadorActual && tablero[4] == jugadorActual && tablero[8] == jugadorActual)
                || (tablero[2] == jugadorActual && tablero[4] == jugadorActual && tablero[6] == jugadorActual);
    }

    private static boolean tableroLleno() {
        for (int i = 0; i < 9; i++) {
            if (tablero[i] == ' ') {
                return false;
            }
        }
        return true;
    }
}