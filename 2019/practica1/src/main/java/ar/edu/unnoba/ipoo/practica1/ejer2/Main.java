package ar.edu.unnoba.ipoo.practica1.ejer2;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Titular t = new Titular();
		
		CA ca = new CA();
		ca.setTitular(t);
		ca.depositar(20);

		/*String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse("12-01-2018");
		Date d = sdf.parse("10/09/2010");*/
		ca.setFecha(GregorianCalendar.getInstance().getTime());
		System.out.println(ca.getSaldo());

		ca.extraer(5);
		System.out.println(ca.getSaldo());
	}

}
