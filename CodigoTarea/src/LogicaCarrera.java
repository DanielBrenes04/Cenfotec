public class LogicaCarrera {

    static  String[] Carrera;
    static int IndiceCarrera;

    static void IniciarCarrera(int size){
        Carrera = new String [size];
    }

    static void registrarCarrera(String codigo,boolean acreditada,String nombre,boolean activo){
        String dato = codigo + "," + acreditada + "'" + nombre + "," + activo;
        Carrera[IndiceCarrera]=dato;
        IndiceCarrera++;
    }

    static String[] imprimirCarrera(){
        String[] data = new String[IndiceCarrera];
        for(int i=0;i<IndiceCarrera;i++){
            data[i]=Carrera[i];
        }
        return data;
    }
}
