import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("¿Cuántos términos de Fibonacci quieres ver? ");
        int n = entrada.nextInt();
        
        int a = 0;
        int b = 1;
        int contador = 1;
        
        System.out.println("Serie:");
        while (contador <= n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            contador++;
        }
    }
}