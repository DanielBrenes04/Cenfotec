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
            out.println("2.Llenar una linea");
            out.println("2.Imprimir factura");
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
        int numero = 0;
        switch (pOpcion)
        {

            case 0:
                System.out.println("Gracias por usar el sistema");
                break;
            case 1:
                registrarFactura();
                break;
            case 2:
                registrarLinea(numero);
                break;
            case 3:
                imprimirFactura();
            default:
                out.println("Digitó una opción no válida");
                break;
        }
    }


    public static void registrarFactura() throws IOException {

        out.println("Digite el numero que tendra la factura");
        String numero = in.readLine();
        out.println("Digite el nombre del cliente");
        String nombre = in.readLine();
        out.println("Digite el dia");
        int dia = Integer.parseInt(in.readLine());
        out.println("Digite el mes");
        int mes = Integer.parseInt(in.readLine());
        out.println("Digite el año");
        int anio = Integer.parseInt(in.readLine());

        int num = 1;
        String[] datosLin= registrarLinea(num);
        gestor.registrarFactura(numero,nombre,dia,mes,anio,datosLin);


    }



    public static String[] registrarLinea(int numero) throws IOException{
        String[] datos = new String[4];

        out.println("Digite la cantidad de productos");
        datos[0] = in.readLine();
        out.println("Digite el codigo del producto");
        datos[1] = in.readLine();
        out.println("Digite la descripcion del producto");
        datos[2] = in.readLine();
        out.println("Digite el precio");
        datos[3] = in.readLine();

        if (numero == 0) {
            System.out.println("Digite el número de fatura al que desea agregarle la línea de detalle.");
            String num = in.readLine();

            if (gestor.BuscarFactura(num) == -1) {
                System.out.println("Lo sentimos, esa factura no existe.");
            } else {
                gestor.registrarLinea(datos, num);
            }
        }
        return datos;
    }






    public static void imprimirFactura() {
        String[] data = gestor.ListarFacturas();
        for(String info : data){
            System.out.println(info);
        }
    }


}

