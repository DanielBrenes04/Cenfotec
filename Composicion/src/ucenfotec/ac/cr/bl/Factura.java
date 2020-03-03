package ucenfotec.ac.cr.bl;

import java.util.ArrayList;
import java.util.Vector;

public class Factura {
    private String mnumero;
    private String mcliente;
    private Fecha mfecha;
    private ArrayList<Linea> mdetalle;
    /* Constructor */

    public Factura(){
    }


    public Factura(String mnumero,String mcliente,int mdia,int mmes, int manio,Linea lin) {
        this.mnumero = mnumero;
        this.mcliente = mcliente;
        this.mfecha = new Fecha(mdia,mmes,manio);
        mdetalle = new ArrayList<>();
    }


    public String getMnumero() {
        return mnumero;
    }

    public void setMnumero(String mnumero) {
        this.mnumero = mnumero;
    }

    public String getMcliente() {
        return mcliente;
    }

    public void setMcliente(String mcliente) {
        this.mcliente = mcliente;
    }

    public Fecha getMfecha() {
        return mfecha;
    }

    public void setMfecha(Fecha mfecha) {
        this.mfecha = mfecha;
    }


    private double calcularSubtotal(){
        double retornar = 0.0;
        Linea LineaDetalle;

        for(Linea linea: mdetalle){
            LineaDetalle = linea;
            retornar += LineaDetalle.calcularCosto();
        }
        return retornar;
    }

    private double calcularImpuesto( ){
        double impuesto;
        impuesto = calcularSubtotal()* 13/100;
        return impuesto;
    }

    public double calcularTotal( ){
        double total;
        total = calcularSubtotal() + calcularImpuesto();
        return total;
    }

    public void agregarLinea(Linea tmplinea) {mdetalle.add(tmplinea);};



    public String toString(){
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