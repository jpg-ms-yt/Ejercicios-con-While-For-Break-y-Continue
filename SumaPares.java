public class SumaPares {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Si el residuo es 0, es par
                suma = suma + i;
            }
        }
        
        System.out.println("La suma de todos los números pares del 1 al 100 es: " + suma);
    }
}