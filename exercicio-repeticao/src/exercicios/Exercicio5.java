package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Integer numero;
		Integer contador = 0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Digite um n�mero para somar: ");
			numero = ler.nextInt();
			contador = contador + numero;
			System.out.println("Nesta rodada a soma �: "+ contador);
			
		} while (numero > 0);

		System.out.println("Valor da soma dos n�meros digitados: " + contador);
	}
}
