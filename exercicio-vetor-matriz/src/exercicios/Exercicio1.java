package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Integer vetor[] = new Integer[5];
		Integer contador = 0, numeroMaior = 0;

		for (contador = 0; contador < 5; contador++) {
			System.out.println("Digite um número: ");
			vetor[contador] = ler.nextInt();

			if (vetor[contador] > numeroMaior) {
				numeroMaior = vetor[contador];
			}
		}

		System.out.println("O maior número digitado é: " + numeroMaior);
	}
}
