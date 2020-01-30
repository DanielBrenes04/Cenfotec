/*
 *Nombre del programa: Rutinas logica
 *Descripcion: Logica de negocio con algoritmos
 *Fecha de creacion:30/07/19
 *Autor: Yostin Segura Nunez
 *Fecha de modificacion: 30/07/19
 *Modificado por: Yostin Segura Nunez
 */
package Proyectos;

public class RutinasLogica {

    //Aqui se ubican todas las variables globales incluyendo arreglos y matrices
    //Lo que antes eran variables en el main aqui seran variables globales
    //Todas las variables globales tienen alcance a todas las rutinas, por lo tanto
    //no se necesitan como parametros
    public static int[] arr;
    public static double suma = 0;
    public static int indice = 0; //Soporte para navegar por los indices del arreglo

    //Inicializar el arreglo
    public static void inicializa(int ptam) {
        arr = new int[ptam];
    }

    public static int tam() {
        return arr.length;
    }

    //Agrega datos en un indice especifico
    public static void agregaDato(int pdato) {
        arr[indice] = pdato;
        indice++;
    }

    //Rutina para mostrar el contenido del arreglo
    public static String mostrar() {

        String mensaje="";
        for (int i = 0; i < arr.length; i++) {
            mensaje+=(arr[i] + "-");
        }
        mensaje+=("FIN");
        return mensaje;
    }

    public static double calcularPromedio() {
        double suma = 0.0, prom = 0.0;

        //Se desea mostrar el promedio de todos los numeros del arreglo
        for (int cont = 0; cont < arr.length; cont++) {
            suma += arr[cont];
        }

        prom = suma / arr.length;

        return prom;
    }

    //Ordenamiento por burbuja ascendente
    static void ordenamientoBurbuja() {
        int i, k, temporal;
        for (i = arr.length - 1; i > 0; i--) { //Controla los recorridos
            for (k = 0; k < i; k++) { //Va comparando
                if (arr[k] > arr[k + 1]) {
                    temporal = arr[k]; // intercambia
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temporal;
                }
            }
        }
    }//Fin burbuja

    //Ordenamiento descendente
    public static void burbujaDescendente() {
        int i, k, temporal;
        for (i = arr.length - 1; i > 0; i--) { //Controla los recorridos
            for (k = 0; k < i; k++) { //Va comparando
                if (arr[k] < arr[k + 1]) {
                    temporal = arr[k]; // intercambia
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temporal;
                }
            }
        }
    }

    static void ordenamientoSeleccionAscendente() {
        int i, k, pos, max, aux;
        for (i = arr.length - 1; i > 0; i--) { //Controla los recorridos
            for (k = 0, max = arr[0], pos = 0; k <= i; k++) { // Localiza el mayor
                if (arr[k] > max) {
                    max = arr[k]; //max tiene el valor del mayor
                    pos = k; //pos tiene la posición del mayor en a
                }
            }
            aux = arr[pos]; // Intercambia el mayor con el elemento que
            arr[pos] = arr[i]; // está en la posición i
            arr[i] = aux;
        }//fin del for
    }//fin del procedimiento

    static void ordenamientoSeleccionDescendente() {
        int i, k, pos, max, aux;
        for (i = arr.length - 1; i > 0; i--) { //Controla los recorridos
            for (k = 0, max = arr[0], pos = 0; k <= i; k++) { // Localiza el mayor
                if (arr[k] < max) {
                    max = arr[k]; //max tiene el valor del mayor
                    pos = k; //pos tiene la posición del mayor en a
                }
            }
            aux = arr[pos]; // Intercambia el mayor con el elemento que
            arr[pos] = arr[i]; // está en la posición i
            arr[i] = aux;
        }//fin del for
    }//fin del procedimiento

}//Fin del programa