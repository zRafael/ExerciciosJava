package exercicios;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {

		Integer numero[] = new Integer[10];
		Integer numeroMaior = 0, contNumero = 0;
		Random gerador = new Random();
		Double soma = 0.0, media = 0.0;

		for (Integer contador = 0; contador < 10; contador++) {
			System.out.println("Iniciando Programa de n�meros aleat�rios... ");
			numero[contador] = gerador.nextInt(10);

			System.out.println(numero[contador]);

			if (numero[contador] > numeroMaior) {
				numeroMaior = numero[contador];
				contNumero++;
			}
			soma = numero[contador] + soma;
			media = soma / contador;

		}
		System.out.println("\nA media aritm�tica dos n�meros �: " + media);
		System.out.println("\nHouve uma ocorr�ncia de n�meros maiores: " + contNumero);

	}

}
