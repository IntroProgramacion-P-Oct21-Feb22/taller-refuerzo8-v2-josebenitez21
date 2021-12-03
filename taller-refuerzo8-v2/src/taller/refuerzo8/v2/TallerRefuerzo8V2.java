/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.refuerzo8.v2;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
import java.util.Locale;

public class TallerRefuerzo8V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int tipo_cliente = 0;
        String nombre = "";
        int descuento_1 = 1;
        int descuento_2 = 5;
        int descuento_3 = 10;
        int descuento_4 = 15;
        int cedula = 0;
        int cantidad = 0;
        int tipo_computadora = 0;
        int computadora1 = 1000;
        int computadora2 = 1100;
        int computadora3 = 900;
        //String productos = "";
        String cadenaFinal = "";
        double subtotal = 0;
        boolean bandera = true;
        String salida;
        double total = 0;
        int precio = 0;
        double contador = 0;

        cadenaFinal = String.format("%s\n", "Datos ingresados");

        while (bandera) {

            System.out.println("Ingrese el nombre del cliente");
            nombre = entrada.nextLine();

            System.out.println("Ingrese el número de cédula");
            cedula = entrada.nextInt();

            System.out.println("Ingrese que tipo de cliente es : 1, 2 , 3 o 4");
            tipo_cliente = entrada.nextInt();

            System.out.println("Seleccione el tipo de computadora disponible: 1, 2 o 3");
            tipo_computadora = entrada.nextInt();

            System.out.println("Ingrese la cantidad de computadoras a comprar");
            cantidad = entrada.nextInt();

            switch (tipo_computadora) {
                case 1:
                    precio = computadora1;
                    tipo_computadora = computadora1 * cantidad;
                    subtotal = (tipo_computadora * descuento_1) / 100;
                    total = tipo_computadora - subtotal;
                    break;
                case 2:
                    precio = computadora2;
                    tipo_computadora = computadora2 * cantidad;
                    tipo_computadora = computadora2 * cantidad;
                    subtotal = (tipo_computadora * descuento_2) / 100;
                    total = tipo_computadora - subtotal;
                    break;
                case 3:
                    precio = computadora3;
                    tipo_computadora = computadora3 * cantidad;
                    tipo_computadora = computadora3 * cantidad;
                    subtotal = (tipo_computadora * descuento_3) / 100;
                    total = tipo_computadora - subtotal;
                    break;
                default:
                    break;
            }
            entrada.nextLine();
            contador = contador + total;
            System.out.println("Ingrese si para salir");
            salida = entrada.nextLine();

            if (salida.equals("si")) {
                bandera = false;
            }
            cadenaFinal = String.format("%s\n" + "Cliente con %s, con cédula %d, "
                    + "compra %d computadoras con precio individual $ %d. Total"
                    + " a pagar %.2f\nTotal venta de computadoras: $ %.2f ",
                     cadenaFinal, nombre,
                    cedula, cantidad, precio, total, contador);
        }
        System.out.println(cadenaFinal);

    }
}
