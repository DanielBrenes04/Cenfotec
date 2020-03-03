package ucenfotec.ac.cr.bl;

import java.text.DecimalFormat;

public class Linea {
    private float mcantidad;
    private String mcodigo;
    private String mdescripcion;
    private double mprecio;

    Linea() {
    }

    public Linea(float cantidad, String codigo, String descripcion, double precio) {
        this.mcantidad = cantidad;
        this.mcodigo = codigo;
        this.mdescripcion = descripcion;
        this.mprecio = precio;
    }


    @Override
    public String toString() {
        String pattern = "###,###,###";
        DecimalFormat myFormatter = new DecimalFormat(pattern);


        return mcantidad + "\t\t\t\t\t\t" + mcodigo + "\t\t\t\t\t" + mdescripcion +
                "\t\t\t\t\t\t" + myFormatter.format(mprecio) + "\t\t\t\t\t" +
                myFormatter.format(calcularCosto()) + "\n";
    }

    public double calcularCosto(){ return ((mcantidad) * (mprecio));}
}
