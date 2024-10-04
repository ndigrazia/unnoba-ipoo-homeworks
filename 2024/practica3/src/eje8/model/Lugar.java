package eje8.model;

public class Lugar {

    private String ciudad;
    private String provincia;
    private String pais;

    public Lugar(String ciudad, String provincia, String pais) {
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Lugar [ciudad=" + ciudad + ", provincia=" + provincia + ", pais=" + pais + "]";
    }
    
}
