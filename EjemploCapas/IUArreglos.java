/*
 *Nombre del programa: IUArreglos
 *Descripcion: Interfaz de usuario de la capa de presentacion
 *Fecha de creacion:30/07/19
 *Autor: Yostin Segura Nunez
 *Fecha de modificacion: 30/07/19
 *Modificado por: Yostin Segura Nunez
 */
package Proyectos;


import java.io.*;

public class IUArreglos {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        crearArreglo();

        llenarArreglo();
        mostrarArreglo();
//        prom = calcularPromedio(arr);
        imprimirPromedio(RutinasLogica.calcularPromedio());

        //Ordenamiento ascendente
        RutinasLogica.ordenamientoBurbuja();
        out.print("Arreglo ordenado con burbuja ascendente: ");
        mostrarArreglo();

        //Ordenamiento descendente
        RutinasLogica.burbujaDescendente();
        out.print("Arreglo ordenado con burbuja descendente: ");
        mostrarArreglo();

        RutinasLogica.ordenamientoSeleccionAscendente();
        out.print("Arreglo ordenado con ordenamiento ascendente: ");
        mostrarArreglo();

        RutinasLogica.ordenamientoSeleccionDescendente();
        out.print("Arreglo ordenado con ordenamiento Descendente: ");
        mostrarArreglo();

    }//Fin del Main

    public static void crearArreglo() throws IOException {

        int tam = 0;
        out.println("Digite el tamano del arreglo");
        tam = Integer.parseInt(in.readLine());
        RutinasLogica.inicializa(tam);
    }

    public static void llenarArreglo() throws IOException {

        for (int i = 0; i < RutinasLogica.tam(); i++) {

            out.println("Digite el dato " + (i + 1) + ":");
            int dato = Integer.parseInt(in.readLine());
            RutinasLogica.agregaDato(dato);
        }

    }

    public static void mostrarArreglo() {

        out.println(RutinasLogica.mostrar());
    }



    public static void imprimirPromedio(double pprom) {

        out.println("El promedio de los numeros es " + pprom + ":");
    }



}//Fin del programa