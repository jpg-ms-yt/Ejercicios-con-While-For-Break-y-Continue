import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = entrada.nextInt();
        int resultado = 1;
        int contador = 1;
        
        while (contador <= numero) {
            resultado = resultado * contador;
            contador++;
        }
        
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}