package exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Integer numero1, numero2, numero3;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo número:");
		numero2 = ler.nextInt();
		System.out.println("Digite o segundo número:");
		numero3 = ler.nextInt();

		System.out.println("Printando os número de forma crescente...");

		if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
			System.out.println(numero1);
			System.out.println(numero2);
			System.out.println(numero3);
		} else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
			System.out.println(numero2);
			System.out.println(numero1);
			System.out.println(numero3);
		}

		else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2) {
			System.out.println(numero3);
			System.out.println(numero1);
			System.out.println(numero2);
		}

		else if (numero1 >= numero2 && numero1 >= numero3 && numero2 >= numero3) {
			System.out.println(numero3);
			System.out.println(numero2);
			System.out.println(numero1);
		} else if (numero2 >= numero1 && numero2 >= numero3 && numero1 <= numero3) {
			System.out.println(numero3);
			System.out.println(numero1);
			System.out.println(numero2);
		}

		else if (numero3 >= numero1 && numero3 >= numero2 && numero1 >= numero2) {
			System.out.println(numero2);
			System.out.println(numero1);
			System.out.println(numero3);
		}

	}
}
