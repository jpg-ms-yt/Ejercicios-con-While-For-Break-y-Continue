import java.util.Scanner;

public class FactorialConFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = entrada.nextInt();
        
        long factorial = 1; // Usamos 'long' porque el número crece mucho
        
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}