import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.io.IOError;
import java.io.IOException;

/*
Autor:Daniel Brenes Fonseca
Ultima Actualizacion: 8 de Febrero
Version:3.1
Objetivo del programa: Un adminstrador de informacion de cursos y carreras de una universidad
Estado:Completo

*/

import java.io.*;
public class UI {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public String[] cursos;
    public String[] carreras;
    public int inidice = 0;


    public static void main(String[] args) throws IOException {
        mostarmenu();

    }

    public static void mostarmenu() throws IOException {
        int opcion = -1;
        do {
            System.out.println("1 para inicializar el programa" +
                    "\n2 Registrar Carreras" +
                    "\n3 Listar Carreras" +
                    "\n4 Registrar Cursos" +
                    "\n5 Listar Cursos" +
                    "\n0 para salir del sistema");
            opcion = seleccionarOpcion();
            procesarOpcion(opcion);
        } while (opcion != 0);

    }

    public static int seleccionarOpcion() throws IOException {
        System.out.println("Digite la opcion que desea ejecutar");
        return Integer.parseInt(in.readLine());
    }

    public static void procesarOpcion(int pOpcion) throws IOException {
        switch (pOpcion) {
            case 0:
                out.println("Muchas gracias por usar el programa");
                break;
            case 1:
                IniciarApp();
                break;
            case 2:
                RegistrarCarrera();
                break;
            case 3:
                ListarCarrera();
                break;
            case 4:
                RegistrarCurso();
                break;
            case 5:
                ListarCursos();
                break;
            default:
                out.println("Digite una opcion no valida");
                break;
        }
    }


    static void IniciarApp() throws IOException {
        System.out.println("Digite cuantas cursos va a registrar");
        int CantidadCursos = Integer.parseInt(in.readLine());
        LogicaCurso.IniciarCursos(CantidadCursos);
        System.out.println("Digite cuantas carreras va a registrar");
        int CantidadCarrera = Integer.parseInt(in.readLine());
        LogicaCarrera.IniciarCarrera(CantidadCarrera);

    }


    static void RegistrarCarrera() throws IOException {
        String codigo;
        boolean acreditada = true;
        String nombre;
        boolean activa = false;
        System.out.println("Digite el codigo de la carrera");
        codigo = in.readLine();
        System.out.println("Digite [1] si el la carrera esta creditada digite [2] de caso contrario");
        if (Integer.parseInt((in.readLine())) == 1) {
            acreditada = true;
        }
        System.out.println("Escriba el nombre de la carrera");
        nombre = in.readLine();
        System.out.println("Digite [1] si el la carrera esta activa digite [2] de caso contrario");
        if (Integer.parseInt((in.readLine())) == 1) {
            acreditada = true;
        }
        LogicaCarrera.registrarCarrera(codigo, acreditada, nombre, activa);

    }


    static void ListarCarrera() {
        String[] datos = LogicaCarrera.imprimirCarrera();
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
    }

    static void RegistrarCurso() throws IOException {
        String codigo;
        int creditos;
        String nombre;
        System.out.println("Digite el codigo del curso");
        codigo = in.readLine();
        System.out.println("Digite cuantos creditos tiene el curso");
        creditos = Integer.parseInt(in.readLine());
        System.out.println("Digite el nombre del curso");
        nombre = in.readLine();
        LogicaCurso.registrarCurso(codigo, creditos, nombre);
    }

    static void ListarCursos() {
        String[] datos = LogicaCurso.imprimirCurso();
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
    }
}
