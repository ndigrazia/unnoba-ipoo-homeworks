package ar.edu.unnoba.ipoo.practica1.ejer5;

import sun.reflect.generics.factory.CoreReflectionFactory;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    List<Contacto> contactos = new ArrayList<Contacto>();

    List<Correo> recibidos = new ArrayList<Correo>();
    List<Correo> enviados = new ArrayList<Correo>();

    public void addEnviados(Correo c) {
        enviados.add(c);
    }

    public void addRecibidos(Correo c) {
        enviados.add(c);
    }

    public void addContacto(Contacto c) {
        contactos.add(c);
    }

    public int cantCorreos() {
        return cantCorreosRecibidos() +
                cantCorreosEnviados();
    }

    public int cantCorreosRecibidos() {
        return recibidos.size();
    }

    public int cantCorreosEnviados() {
        return enviados.size();
    }

    public int cantContactos() {
        return contactos.size();
    }

    public int cantidadNoLeidos() {
        return getListaNoLeidos().size();
    }

    public List<Correo> getListaNoLeidos() {
        List<Correo> l = new ArrayList<Correo>();

        for (Correo c: recibidos)
            c.addNoLeidos(l);

        return l;
    }
}
