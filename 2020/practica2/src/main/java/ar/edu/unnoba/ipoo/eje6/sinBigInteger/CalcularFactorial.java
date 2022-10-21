package ar.edu.unnoba.ipoo.eje6.sinBigInteger;

public class CalcularFactorial {

	public static void main(String[] args) {
		System.out.println("FactoriaL 50: " + factorial(50));
		System.out.println("FactoriaL 100: " + factorial(100));
	}
	
	public static double factorial(double n) {
		if (n==1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
}
