package ar.edu.unnoba.ipoo.practica1.ejer4;

public class Main {

	public static void main(String[] args) {
		Empresa e = new Empresa();
		e.setDireccion("");
		e.setNombre("");
		
		Contenedor c1 = new Contenedor();
		c1.setDestino("");
		c1.setId("");
		c1.setPesoMaximo(100);
		
		Caja ca1 = new Caja();
		ca1.addSimple(new Simple(12));
		ca1.addSimple(new Simple(16));
		
		c1.addArticulo(ca1);
		c1.addArticulo(new Simple(111));
		
		e.addContenedor(c1);
		
		System.out.println(e.pesoContenedor());
	}

}
