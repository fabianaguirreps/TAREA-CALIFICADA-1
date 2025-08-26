
import java.util.Scanner;

public class PA {
    public static void main(String[] args) {
        final long VELOCIDAD_LUZ = 299792458; // CONSTANTE : NO CAMBIA VALOR
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingresa el número de días: ");
            int dias = sc.nextInt();
            long segundos = (long) dias * 24 * 60 * 60; // CONVERSIÓN DE DÍAS A SEGUNDOS
            long distancia = VELOCIDAD_LUZ * segundos; // DISTANCIA = VELOCIDAD * SEGUNDOS
            System.out.printf("En %d días, la luz recorre %,d metros.%n", dias, distancia);
        }
    }
}   