package br.com.juuwes;

public class Metodos {
	
	public static void main(String[] args) {
		double imc = calcularIMC(70f, 1.50f);
		System.out.println(imc);
	}

	public static double calcularIMC(float peso, float altura) {
		return peso / Math.pow(altura, 2);
	}

	public static boolean isPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}