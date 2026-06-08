public class ContarLimite {
    public static void main(String[] args) {
        
        int limiteSuma = 20; // Si la suma pasa de 20, se detiene
        int suma = 0;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            suma = suma + i; // Vamos sumando
            contador = i;

            if (suma > limiteSuma) {
                System.out.println("La suma superó el límite de " + limiteSuma);
                break; // Para todo
            }
        }

        System.out.println("Último número contado: " + contador);
        System.out.println("Suma final: " + suma);
    }
}