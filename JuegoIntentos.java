import java.util.Scanner;

public class JuegoIntentos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final String CLAVE_CORRECTA = "java123";
        int intentos = 3;

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + " de " + intentos + " - Ingresa la clave: ");
            String claveIngresada = entrada.nextLine();

            if (claveIngresada.equals(CLAVE_CORRECTA)) {
                System.out.println("✅ ¡Correcto! Acceso permitido.");
                break; // Sale si acierta antes de terminar
            } else {
                System.out.println("❌ Clave incorrecta.");
                
                // Si es el último intento, avisa
                if (i == intentos) {
                    System.out.println("⛔ Se acabaron los intentos. Acceso bloqueado.");
                }
            }
        }
    }
}