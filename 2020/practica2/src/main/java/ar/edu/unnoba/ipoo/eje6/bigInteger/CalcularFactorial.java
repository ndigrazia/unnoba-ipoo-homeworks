package ar.edu.unnoba.ipoo.eje6.bigInteger;

import java.math.BigInteger;

public class CalcularFactorial {

	public static void main(String[] args) {
		System.out.println("FactoriaL 50: " + factorial(BigInteger.valueOf(50)));
		System.out.println("FactoriaL 100: " + factorial(BigInteger.valueOf(100)));
	}
	
	public static BigInteger factorial(BigInteger n) {
		if (n.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		} else {
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
	
}
