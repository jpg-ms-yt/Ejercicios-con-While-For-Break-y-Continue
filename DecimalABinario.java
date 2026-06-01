import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número decimal: ");
        int numero = entrada.nextInt();
        String binario = "";
        
        if (numero == 0) {
            binario = "0";
        } else {
            while (numero > 0) {
                binario = (numero % 2) + binario; // Agrega el residuo al inicio
                numero = numero / 2;
            }
        }
        
        System.out.println("En binario es: " + binario);
    }
}