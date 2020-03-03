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



    public void registrarFactura(String mnumero, String mnombre, int mdia, int mmes, int manio, String[] datosLin) {
        int cantidad = Integer.parseInt(datosLin[0]);
        double precio = Double.parseDouble(datosLin[3]);

        Linea lin = new Linea(cantidad, datosLin[1], datosLin[2], precio);
        Factura fac = new Factura(mnumero, mnombre, mdia, mmes, manio, lin);

        logica.registrarFactura(fac);
        logica.registrarLinea(lin, mnumero);

    }


    public void registrarLinea(String[] datosLin, String num) {

        int cantidad = Integer.parseInt(datosLin[0]);
        double precio = Double.parseDouble(datosLin[3]);

        Linea lin = new Linea(cantidad, datosLin[1], datosLin[2], precio);
        logica.registrarLinea(lin, num);
    }

    public String[] getFacturas() {return logica.getFacturas();}

    public int BuscarFactura(String num) {return logica.BuscarFactura(num);}

}

