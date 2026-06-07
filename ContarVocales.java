import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa una frase o palabra: ");
        String texto = entrada.nextLine().toLowerCase(); // Todo a minúsculas
        
        int contadorVocales = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }
        
        System.out.println("Cantidad de vocales: " + contadorVocales);
    }
}