package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Integer idade;
		Integer contadorJovem = 0, contadorIdosos = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("\nDigite o valor da sua idade: ");
		idade = ler.nextInt();

		while (idade != -99) {
			System.out.println("\nDigite o valor da sua idade: ");
			idade = ler.nextInt();

			if (idade < 21) {
				contadorJovem++;
			}
			if (idade > 50) {
				contadorIdosos++;
			}

		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+ contadorJovem);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+ contadorIdosos);

	}
}
