package ucenfotec.ac.cr.bl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Fecha {
    private int mdia;
    private int mmes;
    private int manio;


    public Fecha(){
    }

    public Fecha(int mdia, int mmes, int manio) {
        this.mdia = mdia;
        this.mmes = mmes;
        this.manio = manio;
    }


    public int getMdia() {
        return mdia;
    }

    public void setMdia(int mdia) {
        this.mdia = mdia;
    }

    public int getMmes() {
        return mmes;
    }

    public void setMmes(int mmes) {
        this.mmes = mmes;
    }

    public int getManio() {
        return manio;
    }

    public void setManio(int manio) {
        this.manio = manio;
    }

    @Override
    public String toString() { return mdia +"/"+ mmes +"/"+manio;}
}


