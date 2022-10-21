package ar.edu.unnoba.ipoo.practica4.ejercicio2;

public class Divisor {

	public int dividir1(int a, int b){
		return a/b;
	}
	
	public int dividir2(int a, int b){
		
		if(b==0)
			return 0;
		
		return a/b;
	}
	
	//Chequeada
	public int dividir3(int a, int b) throws DivisionPorCeroException {
		
		if(b==0)
			throw new DivisionPorCeroException(a, b);
		
		return a/b;
	}
	
	//No Chequeada
	public int dividir4(int a, int b) {
		
		if(b==0)
			throw new DivisionPorCeroRuntimeException(a, b);
		
		return a/b;
	}

	
	public static void main(String[] args) {
		Divisor d = new Divisor();
		
		//A
		System.out.println("Resultado : " + d.dividir1(12, 4));
		System.out.println("Resultado : " + d.dividir1(10, 2));				
		System.out.println("Resultado : " + d.dividir1(12, 3));
		
		//B
		//System.out.println("Resultado : " + d.dividir1(12, 0));
		 //Lanza java.lang.ArithmeticException
		
		//C 
		System.out.println("Resultado : " + d.dividir2(12, 0));
		
		//D Chequeada
		try {
			System.out.println("Resultado : " + d.dividir3(12, 0));
		} catch (DivisionPorCeroException e) {
			System.out.println(e.getMessage());
		}
		
		//D No Chequeada
		System.out.println("Resultado : " + d.dividir4(12, 0));
		
	} 
	
}
