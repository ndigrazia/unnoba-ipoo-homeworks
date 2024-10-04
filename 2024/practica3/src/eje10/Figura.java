package eje10;

public interface Figura extends Imprimible {

    default public void imprimir() { 
      System.out.println("Impresión por defecto"); 
    } 
    
}
