package ucenfotec.ac.cr.bl;

public class Linea {
    private float mcantidad;
    private String mcodigo;
    private String mdescripcion;
    private float mprecio;

    public Linea(float cantidad, String codigo, String descripcion, float precio) {
        this.mcantidad = cantidad;
        this.mcodigo = codigo;
        this.mdescripcion = descripcion;
        this.mprecio = precio;
    }

    public float calcularCosto() {
        return (mcantidad * mprecio);
    }

    public String toString() {
        String msg;
        msg = mcantidad + "\t";
        msg = msg + mcodigo + "\t";
        msg = msg + mdescripcion + "\t";
        msg = msg + mprecio + "\t";
        msg = msg + calcularCosto();
        return msg;
    }
}