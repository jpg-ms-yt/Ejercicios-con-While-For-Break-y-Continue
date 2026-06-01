import java.util.Scanner;

public class ContadorPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el inicio del rango: ");
        int inicio = entrada.nextInt();
        System.out.print("Ingresa el fin del rango: ");
        int fin = entrada.nextInt();
        
        int contadorPrimos = 0;
        
        for (int numero = inicio; numero <= fin; numero++) {
            boolean esPrimo = true;
            
            if (numero <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            
            if (esPrimo) {
                contadorPrimos++;
                System.out.println(numero + " es primo"); // Opcional: muestra cuáles son
            }
        }
        
        System.out.println("Cantidad total de números primos en el rango: " + contadorPrimos);
    }
}