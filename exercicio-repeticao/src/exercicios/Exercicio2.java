package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Integer numero;
		Integer numerosPares = 0;
		Integer numerosImpares = 0;
		Scanner ler = new Scanner(System.in);

		for (Integer contador = 0; contador < 10; contador++) {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();

			if (numero % 2 == 0) {
				System.out.println("Este número é par: " + numero);
				numerosPares++;
			} else {
				System.out.println("Este número é impar: " + numero);
				numerosImpares++;
			}

		}

		System.out.println("\nA quantidade de números pares são: " + numerosPares);
		System.out.println("\nA quantidade de números ímpares são: " + numerosImpares);

	}

}
