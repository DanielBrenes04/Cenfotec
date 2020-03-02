package ucenfotec.ac.cr.dl;

import ucenfotec.ac.cr.bl.Linea;
import ucenfotec.ac.cr.bl.Fecha;
import ucenfotec.ac.cr.bl.Factura;

import java.util.ArrayList;

public class CapaLogica {
    private ArrayList<Factura> factura;
    private ArrayList<Fecha> fecha;
    private ArrayList<Linea> linea;

    public CapaLogica(){
        factura = new ArrayList<>();
        fecha = new ArrayList<>();
        linea = new ArrayList<>();

    }

    public String[] getFacturas(){
        String[] data;
        int i = 0;
        data = new String [Factura];
    }

}
