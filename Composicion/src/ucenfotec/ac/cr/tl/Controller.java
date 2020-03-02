package ucenfotec.ac.cr.tl;


import ucenfotec.ac.cr.bl.Linea;
import ucenfotec.ac.cr.bl.Fecha;
import ucenfotec.ac.cr.bl.Factura;
import ucenfotec.ac.cr.dl.CapaLogica;

public class Controller {
    private CapaLogica logica;


    public Controller(){
        logica = new CapaLogica();
    }

    public String[] ListarFacturas(){
        return logica.getFacturas();
    }
}

