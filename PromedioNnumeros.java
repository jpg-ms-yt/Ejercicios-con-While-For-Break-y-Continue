import java.util.Scanner;

public class PromedioNnumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("¿Cuántos números vas a ingresar? ");
        int cantidad = entrada.nextInt();
        
        double suma = 0;
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double numero = entrada.nextDouble();
            suma = suma + numero;
        }
        
        double promedio = suma / cantidad;
        System.out.println("El promedio es: " + promedio);
    }
}