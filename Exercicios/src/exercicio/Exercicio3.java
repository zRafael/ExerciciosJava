package exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Integer idade;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.println("Você é infantil!");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Você é juvenil!");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Você é adulto!");
		} else {
			System.out.println("Digite um valor válido!");
		}
	}

}
