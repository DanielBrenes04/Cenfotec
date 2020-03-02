package ucenfotec.ac.cr.bl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Fecha {
    private int mdia;
    private int mmes;
    private int manio;


    public Fecha(int mdia, int mmes, int manio) {
        this.mdia = mdia;
        this.mmes = mmes;
        this.manio = manio;
    }

    @Override
    public String toString() {
        String msg;
        msg ="fecha{" +
                "mdia=" + mdia +
                ", mmes=" + mmes +
                ", manio=" + manio +
                '}';
        return msg;
    }
}


