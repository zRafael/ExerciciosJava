package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Integer numero;
		Integer numerosPares = 0;
		Integer numerosImpares = 0;
		Scanner ler = new Scanner(System.in);

		for (Integer contador = 0; contador < 10; contador++) {
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();

			if (numero % 2 == 0) {
				System.out.println("Este n�mero � par: " + numero);
				numerosPares++;
			} else {
				System.out.println("Este n�mero � impar: " + numero);
				numerosImpares++;
			}

		}

		System.out.println("\nA quantidade de n�meros pares s�o: " + numerosPares);
		System.out.println("\nA quantidade de n�meros �mpares s�o: " + numerosImpares);

	}

}
