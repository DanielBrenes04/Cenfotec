package ucenfotec.ac.cr.ui;

import ucenfotec.ac.cr.tl.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;
    static Controller gestor = new Controller();

    public static void main(String[] args) throws IOException {

        mostrarMenu();
    }

    public static void mostrarMenu() throws IOException {
        int opcion = -1;
        do {
            out.println("1.Llenar una factura");
            out.println("2.Imprimi factura");
            out.println("0.Salir");
            opcion = seleccionarOpcion();
            procesarOpcion(opcion);
        } while (opcion != 0);
    }

    public static int seleccionarOpcion() throws IOException {
        out.println("Digite a opción que desea ejecutar");
        return Integer.parseInt(in.readLine());
    }


    public static void procesarOpcion(int pOpcion) throws IOException {
        switch (pOpcion) {
            case 0:
                System.out.println("Gracias por usar el sistema");
                break;
            case 1:
                Llenarfactura();
                break;
            case 2:
                ImprimirFactura();
                break;

            default:
                out.println("Digitó una opción no válida");
                break;
        }
    }


    public static void Llenarfactura() throws IOException{
        int dia;
        int mes;
        int anno;
        System.out.println("Digite el dia");
        dia = Integer.parseInt(in.readLine());
        System.out.println("Digite el mes");
        mes = Integer.parseInt(in.readLine());
        System.out.println("Digite el año");
        anno = Integer.parseInt(in.readLine());

    }
}
//Lunes dos ejercicios