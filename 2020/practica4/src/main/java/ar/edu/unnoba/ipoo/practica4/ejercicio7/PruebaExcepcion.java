package ar.edu.unnoba.ipoo.practica4.ejercicio7;

public class PruebaExcepcion {

	public static void main(String st[]){
		PruebaExcepcion t1 = new PruebaExcepcion();
		t1.metodo(5,0);
		
		/*A
		Excepci�n Aritm�tica
		Bloque Finally
		Despu�s del bloque finally*/	

		/*B
		The finally block always executes when the try block exits. 
		This ensures that the finally block is executed even if an unexpected 
		exception occurs. But finally is useful for more than just exception 
		handling � it allows the programmer to avoid having cleanup code 
		accidentally bypassed by a return, continue, or break. Putting cleanup 
		code in a finally block is always a good practice, even when no 
		exceptions are anticipated. 
		 */
		
		//C
		//Liberaci�n de recursos. Ej. Conexiones a BD, archivos, colas de mensajeria, etc.
	}

	public void metodo(int a, int b){
		try {
			int c = a/b;
			System.out.println("Despu�s de la divisi�n");
		} catch (ArithmeticException ae) {
			System.out.println("Excepci�n Aritm�tica");
		}
		catch (Exception e) {
			System.out.println("Otra Excepci�n");
		}
		finally {
			System.out.println("Bloque Finally");
		}

		System.out.println("Despu�s del bloque finally");
	}
	
}
