package javaapplication2;


import java.util.Scanner;

public class PA {
    /**
     * Método main - punto de entrada del programa.
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        final long VELOCIDAD_LUZ = 299792458; // CONSTANTE : NO CAMBIA VALOR
           /*
         * try-with-resources:
         * Usamos esta estructura para crear el Scanner y que se cierre automáticamente
         * cuando salgamos del bloque (asegura liberar el recurso).
         */
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingresa el número de días: ");
            int dias = sc.nextInt();
            long segundos = (long) dias * 24 * 60 * 60; // CONVERSIÓN DE DÍAS A SEGUNDOS
            long distancia = VELOCIDAD_LUZ * segundos; // DISTANCIA = VELOCIDAD * SEGUNDOS
            System.out.printf("En %d días, la luz recorre %,d metros.%n", dias, distancia);
        }
    }
}   