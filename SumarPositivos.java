import java.util.Scanner;

public class SumarPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingresa números (0 para terminar):");

        do {
            System.out.print("Número: ");
            numero = entrada.nextInt();

            if (numero < 0) {
                // System.out.println("Negativo, no se suma");
                continue; // Ignora lo que sigue, no suma
            }

            suma = suma + numero; // Solo suma si es >= 0

        } while (numero != 0);

        System.out.println("La suma total de los positivos es: " + suma);
    }
}