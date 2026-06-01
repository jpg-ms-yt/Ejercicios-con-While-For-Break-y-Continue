import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        double suma = 0;
        int cantidad = 0;
        
        System.out.println("Ingresa notas (ingresa -1 para terminar):");
        
        while (true) {
            nota = entrada.nextDouble();
            
            if (nota == -1) {
                break;
            }
            
            suma = suma + nota;
            cantidad++;
        }
        
        if (cantidad > 0) {
            double promedio = suma / cantidad;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No ingresaste ninguna nota.");
        }
    }
}