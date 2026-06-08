public class SaltarMultiplos {
    public static void main(String[] args) {
        
        System.out.println("Números del 1 al 50 (sin múltiplos de 5):");

        for (int i = 1; i <= 50; i++) {

            if (i % 5 == 0) {
                continue; // No imprime este número, pasa al siguiente
            }

            System.out.print(i + " ");
        }
    }
}