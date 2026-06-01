import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el número de filas para el triángulo: ");
        int filas = entrada.nextInt();
        
        for (int i = 1; i <= filas; i++) {
            // Imprime espacios
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Imprime asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea
        }
    }
}