import java.util.Scanner;

public class SalirSiNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa números (ingresa un negativo para terminar):");

        while (true) { // Ciclo infinito
            System.out.print("Número: ");
            numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("¡Ingresaste un negativo! Se detiene el programa.");
                break; // Sale completamente del ciclo
            }
        }
    }
}