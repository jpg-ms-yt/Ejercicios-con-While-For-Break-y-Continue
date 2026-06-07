public class BuscarNumero {
    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 15, 16, 23, 42}; // Arreglo de ejemplo
        int buscado = 16; // Número que queremos encontrar
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] == buscado) {
                encontrado = true;
                System.out.println("¡Número encontrado en la posición: " + i);
                break; // Al encontrarlo, ya no sigue buscando
            }
        }

        if (!encontrado) {
            System.out.println("El número NO está en el arreglo.");
        }
    }
}