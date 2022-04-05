package exercicios;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {

		Random gerador = new Random();

		Integer n1[][] = new Integer[4][6], n2[][] = new Integer[4][6];
		Integer m1[][] = new Integer[4][6], m2[][] = new Integer[4][6];
		Integer linha, coluna;

		System.out.println("Primeira Matriz: ");
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				n1[linha][coluna] = gerador.nextInt(10);
				System.out.print(n1[linha][coluna] + "\t");
			}
			System.out.println("\n");
		}

		System.out.println("Segunda Matriz: ");
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				n2[linha][coluna] = gerador.nextInt(10);
				System.out.print(n2[linha][coluna] + "\t");
			}
			System.out.println("\n");
		}

		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
			}
		}

		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
			}
		}

		System.out.println("Somando elementos...");
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				System.out.print(m1[linha][coluna] + "\t");
			}
			System.out.println("\n");
		}

		System.out.println("Diferença dos elementos...");
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				System.out.print(m2[linha][coluna] + "\t");
			}
			System.out.println("\n");
		}
	}

}
