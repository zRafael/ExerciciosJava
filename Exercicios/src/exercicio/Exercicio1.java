package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String args[]) {

		Integer numero1, numero2, numero3;
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero:");
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = ler.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("Parab�ns n�mero 1 voc� � o maior n�mero!");
		}
		if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("Parab�ns n�mero 2 voc� � o maior n�mero!");
		}
		if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("Parab�ns n�mero 3 voc� � o maior n�mero!");
		}

	}
}
