public class LogicaCurso {

    static  String[] Curso;
    static int IndiceCurso;

    static void IniciarCursos(int size){
        Curso = new String [size];
    }

    static void registrarCurso(String codigo,int creditos,String nombre){
        String dato =codigo + "," + creditos + "," + nombre;
        Curso[IndiceCurso] = dato;
        IndiceCurso++;
    }

    static String[] imprimirCurso(){
        String[] dato = new String[IndiceCurso];
        for(int i=0;i<IndiceCurso;i++){
            dato[i]=Curso[i];
        }
        return dato;
    }
}


