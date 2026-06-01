public class MayorMenorArreglo {
    public static void main(String[] args) {
        // Aquí definimos el arreglo, puedes cambiar los números
        int[] numeros = {12, 45, 7, 23, 56, 89, 3, 10};
        
        int mayor = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}