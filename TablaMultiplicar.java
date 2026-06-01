import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número para ver su tabla de multiplicar: ");
        int numero = entrada.nextInt();
        
        System.out.println("--- Tabla del " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " × " + i + " = " + (numero * i));
        }
    }
}