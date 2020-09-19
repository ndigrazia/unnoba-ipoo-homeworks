package ar.edu.unnoba.ipoo.eje3;

public class PanNegroBuilder extends PanBuilder  {

	private PanNegro panNegro = new PanNegro();
	
	public void anadirHarinaYRemover() {
		panNegro.setComposicionDeHarina("Harina de la que se ha " +
				"quitado salvado y germen de trigo");
	}
	
	@Override
	public Pan getPan() {
		return panNegro;
	}
	
}
