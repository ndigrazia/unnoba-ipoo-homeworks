package ar.edu.unnoba.ipoo.practica5.ejercicio1;

import java.util.Date;

public abstract class FaseLunar {

	public int fases() {
		return Fase.values().length;
	}
	
	public abstract Fase calcularFase(Date d);
	
}
