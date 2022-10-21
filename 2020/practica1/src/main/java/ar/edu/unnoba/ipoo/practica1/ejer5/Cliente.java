package ar.edu.unnoba.ipoo.practica1.ejer5;

public class Cliente {

    private Cuenta cuenta;

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void addEnviados(Correo c) {
        cuenta.addEnviados(c);
    }

    public void addRecibidos(Correo c) {
        cuenta.addRecibidos(c);
    }

    public void addContacto(Contacto c) {
        cuenta.addContacto(c);
    }

    public int cantCorreos() {
        return cuenta.cantCorreos();
    }

    public int cantCorreosRecibidos() {
        return cuenta.cantCorreosRecibidos();
    }

    public int cantCorreosEnviados() {
        return cuenta.cantCorreosEnviados();
    }

    public int cantContactos() {
        return cuenta.cantContactos();
    }

    public int cantidadNoLeidos() {
        return cuenta.cantidadNoLeidos();
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.addEnviados(new Correo());
        c1.addEnviados(new Correo());
        c1.addRecibidos(new Correo());

        Cuenta c2 = new Cuenta();
        c2.addEnviados(new Correo());
        c2.addEnviados(new Correo());

        Cliente cliente = new Cliente();
        cliente.setCuenta(c1);
        cliente.addContacto(new Contacto());

        cliente.setCuenta(c2);
        cliente.cantCorreosEnviados();
    }

}
