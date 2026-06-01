import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final String CONTRASENA_CORRECTA = "1234"; // Puedes cambiarla
        String intento;
        
        System.out.print("Ingresa tu contraseña: ");
        intento = entrada.nextLine();
        
        while (!intento.equals(CONTRASENA_CORRECTA)) {
            System.out.println("Contraseña incorrecta, intenta de nuevo.");
            System.out.print("Contraseña: ");
            intento = entrada.nextLine();
        }
        
        System.out.println("¡Contraseña correcta! Bienvenido.");
    }
}