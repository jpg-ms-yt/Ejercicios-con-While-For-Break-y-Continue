import java.util.Scanner;

public class SerieExponencial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos los valores
        System.out.print("Ingresa el valor de x: ");
        int x = entrada.nextInt();
        System.out.print("Ingresa el valor de n: ");
        int n = entrada.nextInt();
        
        double suma = 1; // Empezamos con el primer valor: el 1
        
        // Recorremos desde 1 hasta n, calculando cada potencia y sumando
        for (int i = 1; i <= n; i++) {
            suma = suma + Math.pow(x, i); 
            // Math.pow(x, i) significa: x elevado a la potencia i
        }
        
        // Mostramos el resultado final
        System.out.println("El resultado de la serie es: " + suma);
    }
}