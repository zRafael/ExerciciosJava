package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String args[]) {

		Integer numero1, numero2, numero3;
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o primeiro número:");
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		numero3 = ler.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("Parabéns número 1 você é o maior número!");
		}
		if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("Parabéns número 2 você é o maior número!");
		}
		if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("Parabéns número 3 você é o maior número!");
		}

	}
}
