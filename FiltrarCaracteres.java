public class FiltrarCaracteres {
    public static void main(String[] args) {
        
        String texto = "H0l4 Mund0 123"; // Cadena de ejemplo
        System.out.println("Solo las letras:");

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            // Si es un número (del '0' al '9'), lo ignoramos
            if (letra >= '0' && letra <= '9') {
                continue;
            }

            // Si no es número, lo mostramos
            System.out.print(letra);
        }
    }
}