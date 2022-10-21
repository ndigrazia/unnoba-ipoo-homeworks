package ar.edu.unnoba.ipoo.eje3;

public class PanBlancoBuilder extends PanBuilder  {

	private PanBlanco panBlanco = new PanBlanco();
	
	public void anadirHarinaYRemover() {
		panBlanco.setComposicionDeHarina("Harina que contiene solo" +
				" la parte central del grano");
	}

	public void amasar() {
		System.out.println("amasar estilo pan blanco()");
	};

	public Pan getPan() {
		return panBlanco;
	}

}
