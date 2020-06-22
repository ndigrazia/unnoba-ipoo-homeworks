package ar.edu.unnoba.ipoo.MMXIX.practica1.ejer2;

public class Main {

	public static void main(String[] args) {
		Titular t = new Titular();
		
		CA ca = new CA();
		ca.setTitular(t);
		ca.depositar(20);
		System.out.println(ca.getSaldo());
		ca.extraer(5);
		System.out.println(ca.getSaldo());
	}

}
