public class PrimerMultiplo {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            
            if (i % 7 == 0) {
                System.out.println("El primer múltiplo de 7 es: " + i);
                break; // Se detiene en el PRIMERO que encuentra
            }

        }
    }
}