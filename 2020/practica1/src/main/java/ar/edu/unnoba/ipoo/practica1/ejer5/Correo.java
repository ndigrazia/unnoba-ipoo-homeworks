package ar.edu.unnoba.ipoo.practica1.ejer5;

import java.util.List;

public class Correo {

    private boolean leido;

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public void addNoLeidos(List<Correo> l) {
        if(!isLeido())
            l.add(this);
    }

}
