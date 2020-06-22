package practica5.ejercicio3;

import java.util.Calendar;
import java.util.Date;

public class FaseLunarImp extends FaseLunar {
	
	/**
	 * Calcula la posición de la luna
	 */
	private int determinarPosicion(Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		int dia = cal.get(Calendar.DATE);
		int mes = cal.get(Calendar.MONTH);
		int año = cal.get(Calendar.YEAR);
		
		double c, e, jd = 0.0; 
		int b = 0;
		
		if (dia < 3)
		{
			año--;
			mes += 12;
		}
		
		++mes;
		
		c = 365.25 * año;
		e = 30.6 * mes;
		jd = c + e + dia - 694039.09; 
		jd /= 29.5305882; 
		b = (int) jd; 
		jd -= b; 
		b = (int)Math.round(jd * 8);
		
		if (b >= 8)
			b = 0;

		return b;
	}
	
	/**
	 * Establece la Fase lunar
	 */
	public Fase calcularFase(Date d) {
		switch (determinarPosicion(d))
		{
			case 0:
				return Fase.LunaNueva;
			case 1:
				return Fase.CrecienteIluminante;
			case 2:
				return Fase.CuartoCreciente;
			case 3:
				return Fase.GibosaIluminante;
			case 4:
				return Fase.LunaLlena;
			case 5:
				return Fase.GibosaMenguante;
			case 6:
				return Fase.CuartoMenguante;
			case 7:
				return Fase.CrecienteMenguante;
		}
		
		throw new RuntimeException("Error al determinar la fase de la luna.");
	}

}
