import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = entrada.nextInt();
        
        int sumaDivisores = 0;
        
        // Buscamos divisores propios (menores al número)
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores = sumaDivisores + i;
            }
        }
        
        if (sumaDivisores == numero) {
            System.out.println(numero + " ES un número perfecto ✅");
        } else {
            System.out.println(numero + " NO es un número perfecto ❌");
        }
    }
}