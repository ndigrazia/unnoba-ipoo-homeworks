package ar.edu.unnoba.ipoo.practica1.ejer7;

public class Main {
	 public static void main(String[] args) {
		 Internacional t = new Internacional();

		 t.setMonto(23);
		 t.setMoneda(Moneda.EURO);
		 
		 System.out.println(t.montoEnPesos());
	}
}
