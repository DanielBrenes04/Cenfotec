package ucenfotec.ac.cr.bl;

import java.util.Vector;

public class Factura {
    private String mnumero;
    private String mcliente;
    private Fecha mfecha;
    private Vector mdetalle;
    /* Constructor */


    public Factura(String pnumero, String pcliente, int pdia, int pmes, int panio) {
        mnumero(pnumero);
        mcliente(pcliente);
        mfecha = new Fecha(pdia, pmes, panio);
        mdetalle = new Vector();

    }

    private float calcularSubtotal( ){
        Linea lineaDetalle;
        float subtotal;
        subtotal = 0;
        for(int i = 0; i< mdetalle.size(); i++){
            lineaDetalle = (Linea) mdetalle.get(i);
            subtotal = subtotal + lineaDetalle.calcularCosto();
        }
        return subtotal;
    }

    private float calcularImpuesto( ){
        float impuesto;
        impuesto = calcularSubtotal()* 13/100;
        return impuesto;
    }

    public float calcularTotal( ){
        float total;
        total = calcularSubtotal() + calcularImpuesto();
        return total;
    }

    public void agregarLinea( int pcantidad,
                              String pcodigo,
                              String pdescripcion,
                              float pprecio ){
        mdetalle.add( new Linea(pcantidad,pcodigo,
                pdescripcion, pprecio));
    }


    public String toString( ){
        String msg;
        Linea lineaD;
        msg = "================================"+ "\n";
        msg = msg + "Joyeria la Perla";
        msg = msg + "\t\t" + "No. " + mnumero + "\n";
        msg = msg + "cliente: " + mcliente + " ";
        msg = msg + "\t" + mfecha.toString() + "\n";
        msg = msg + "------------------------------------------" + "\n";
        msg = msg + "cant" + "\t"+ "codigo" + "\t"+ "descrip" +
                "\t"+ "precio" + "\t"+ "costo" + "\n";
        for(int i = 0; i< mdetalle.size(); i++){
            lineaD = (Linea) mdetalle.get(i);
            msg = msg + lineaD.toString() + "\n";
        }
        msg = msg + "\t\t\t\t" + "----------" + "\n";
        msg = msg + "\t\t\t" + "subtotal:"+this.calcularSubtotal()+"\n";
        msg = msg + "\t\t\t" + "impuesto:"+this.calcularImpuesto()+"\n";
        msg = msg + "\t\t\t" + "total :"+this.calcularTotal()+"\n";
        msg = msg + "========================" + "\n";
        return msg;
    }
}