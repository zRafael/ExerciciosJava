package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Integer matriz[][] = new Integer[3][3], linha, coluna, numero, somaA = 0, somaB = 0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um número: ");
				numero = ler.nextInt();
				matriz[linha][coluna] = numero;
				somaA = somaA + matriz[linha][coluna];
			}
		}
		somaB = matriz[0][0] + matriz[1][1] + matriz[2][2];
		
		System.out.println("Imprimindo Matriz... ");
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.println("\n");
		}
	
		System.out.println("Soma de todos os valores: " + somaA);
		System.out.println("Soma dos valores na diagonal principal: " + somaB);

	}

}
