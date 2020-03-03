package ucenfotec.ac.cr.dl;

import ucenfotec.ac.cr.bl.Linea;
import ucenfotec.ac.cr.bl.Fecha;
import ucenfotec.ac.cr.bl.Factura;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Factura> factura;
    private Fecha fecha;
    private ArrayList<Linea> linea;

    public CapaLogica(){
        factura = new ArrayList<>();
        fecha = new Fecha();
        linea = new ArrayList<>();

    }


    public CapaLogica(ArrayList<Linea>  lineas,Fecha fecha,ArrayList<Factura> factura){
        this.linea = lineas;
        this.fecha = fecha;
        this.factura = factura;
    }

    public void  registrarFactura(Factura f){
        factura.add(f);
    }

    public String[] getFacturas(){
        String[] data = new String[factura.size()];
        int i = 0;
        for (Factura tmpfactura : factura){
            data[i] = tmpfactura.toString();
            i++;
        }
        return data;
    }

    public void registrarLinea(Linea tmpLinea,String num){

        for (Factura tmpfactura: factura){
            if(tmpfactura.getMnumero().equals(num));
            tmpfactura.agregarLinea(tmpLinea);
        }
    }


    public int BuscarFactura(String numero){
        int retornar = 0;
        for(Factura tmpfacturas : factura){
            if(numero.equals(tmpfacturas.getMnumero())){
                retornar = 1;
            }else{
                retornar = -1;
            }
        }
        return retornar;
    }



}
