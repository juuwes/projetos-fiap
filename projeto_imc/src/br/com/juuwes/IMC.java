package br.com.juuwes;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantas pessoas irão se consultar?");
		int numeroDeConsultados = scanner.nextInt();

		float altura[] = new float[numeroDeConsultados];
		float peso[] = new float[numeroDeConsultados];
		double imc[] = new double[numeroDeConsultados];
//	double imc = 0;

		for (int i = 0; i < numeroDeConsultados; i++) {
			System.out.println("Qual o peso da " + (i + 1) + "ª pessoa?");
			peso[i] = scanner.nextFloat();
			System.out.println("Qual a altura da " + (i + 1) + "ª pessoa?");
			altura[i] = scanner.nextFloat();
			imc[i] = Metodos.calcularIMC(peso[i], altura[i]);
		}

/*	for (int i = numeroDeConsultados; i > 0; i--) {
*	imc = peso[i - 1] / (altura[i - 1] * altura[i - 1]);
*	System.out.printf("%.2f", imc);
*	} */
		
		for (int i = 0; i < numeroDeConsultados; i++) {
			System.out.printf("Resultado do IMC:\n" + (i + 1) + "ª pessoa: %.2f", imc[i]);
		}

		scanner.close();
	}
}