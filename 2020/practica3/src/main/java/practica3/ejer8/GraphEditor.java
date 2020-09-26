package practica3.ejer8;

import java.util.ArrayList;
import java.util.List;

public class GraphEditor {

	private List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
	
	public GraphEditor() { 
	}
	
	public void addFigura(FiguraGeometrica f) {
		figuras.add(f);
	}
	
	public void removerFigura(FiguraGeometrica f) {
		figuras.remove(f);
	}

	public void mover(int unPunto, Direccion direccion) {
		for(FiguraGeometrica f : figuras) 
			f.mover(unPunto, direccion);
	}

	public double calcularAreaOcupadaPorFiguras() {
		double t = 0;
		
		for(FiguraGeometrica f : figuras) 
			t += f.area();
			
		return t;
	}
	
}
