package javaapplication2;

import java.util.Scanner; // Importa la clase Scanner para entrada de datos

/**
 * PA2 - Programa que genera una boleta de venta.
 * 
 * Funcionalidades:
 *  - Pide el nombre del cliente.
 *  - Permite registrar 2 productos (nombre, precio, cantidad).
 *  - Calcula subtotales, descuentos y totales.
 *  - Aplica descuentos especiales según nombre del cliente o si el producto contiene "GAMER".
 *  - Imprime la boleta con formato.
 */

public class PA2 {
    public static void main(String[] args) {
            /*
         * try-with-resources:
         * Usamos esta estructura para abrir un Scanner y que se cierre automáticamente
         * al finalizar el bloque.
         */
        
        try (Scanner sc = new Scanner(System.in) 
        ) {
            
            System.out.print("Ingrese nombre del cliente: ");
            String nombreCliente = sc.nextLine();
            
           
            String[] nombresProducto = new String[2];
            double[] precios = new double[2];
            int[] cantidades = new int[2];
            double[] subtotales = new double[2];
            double[] descuentos = new double[2];
            double[] totales = new double[2];
            
            
            for (int i = 0; i < 2; i++) {
                System.out.println("\nProducto " + (i + 1));
                System.out.print("Nombre del producto: ");
                nombresProducto[i] = sc.nextLine();
                
                System.out.print("Precio: ");
                precios[i] = sc.nextDouble();
                
                System.out.print("Cantidad: ");
                cantidades[i] = sc.nextInt();
                sc.nextLine();
                
                // Calcula el subtotal
                subtotales[i] = precios[i] * cantidades[i];
                
                // Calcula descuentos
                descuentos[i] = 0;
                // Descuento por nombre de cliente
                if (nombreCliente.equals("ANA") || nombreCliente.equals("JUAN")) {
                    descuentos[i] += subtotales[i] * 0.05;
                }
                // Descuento adicional si el producto contiene "GAMER"
                if (nombresProducto[i].toUpperCase().contains("GAMER")) {
                    descuentos[i] += subtotales[i] * 0.02;
                }
                
                // Calcula el total con descuento
                totales[i] = subtotales[i] - descuentos[i];
            }
            
            // Imprime la boleta con formato
            System.out.println("\n------------------ BOLETA DE VENTA ------------------");
            System.out.printf("Cliente: %s\n", nombreCliente);
            System.out.println("-----------------------------------------------------");
            System.out.printf("%-20s %8s %8s %10s %10s\n", "Producto", "Precio", "Cant", "Subtotal", "Desc.");
            System.out.println("-----------------------------------------------------");
            for (int i = 0; i < 2; i++) {
                System.out.printf("%-20s %8.2f %8d %10.2f %10.2f\n",
                        nombresProducto[i], precios[i], cantidades[i], subtotales[i], descuentos[i]);
            }
            System.out.println("-----------------------------------------------------");
            double totalPagar = totales[0] + totales[1];
            System.out.printf("TOTAL A PAGAR: %.2f\n", totalPagar);
            System.out.println("-----------------------------------------------------");
        }
    }
}
