package ar.edu.unnoba.ipoo.eje3;

public class PanIntegralBuilder extends PanBuilder  {

	private PanIntegral panIntegral = new PanIntegral();
	
	public void anadirHarinaYRemover() {
		panIntegral.setComposicionDeHarina("Harina que conserva " +
				"todos sus componentes");
	}
	
	@Override
	public Pan getPan() {
		return panIntegral;
	}

}
