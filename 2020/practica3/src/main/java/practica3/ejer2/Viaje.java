package practica3.ejer2;

import java.util.Date;

public class Viaje {

    private Date fecha;
    private int cantPasajeros;

    public Viaje(Date fecha, int cantPasajeros) {
        this.fecha = fecha;
        this.cantPasajeros = cantPasajeros;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
}
