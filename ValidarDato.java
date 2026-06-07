import java.util.Scanner;

public class ValidarDato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;

        while (true) {
            System.out.print("Ingresa tu edad (entre 1 y 120): ");
            edad = entrada.nextInt();

            if (edad < 1 || edad > 120) {
                System.out.println("❌ Edad inválida. Intenta de nuevo...");
                continue; // Vuelve al inicio del ciclo, no pasa de aquí
            }

            // Si llega aquí, es porque la edad está bien
            System.out.println("✅ Edad válida: " + edad + " años. Bienvenido.");
            break; // Termina el programa
        }
    }
}