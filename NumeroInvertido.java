import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();
        int invertido = 0;
        
        while (numero != 0) {
            invertido = (invertido * 10) + (numero % 10);
            numero = numero / 10;
        }
        
        System.out.println("Número invertido: " + invertido);
    }
}