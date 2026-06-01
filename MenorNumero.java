import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int menor = Integer.MAX_VALUE; // Empieza con el valor más alto posible
        
        System.out.println("Ingresa números (ingresa 0 para terminar):");
        
        while (true) {
            numero = entrada.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        if (menor != Integer.MAX_VALUE) {
            System.out.println("El número menor ingresado es: " + menor);
        } else {
            System.out.println("No ingresaste ningún número válido.");
        }
    }
}