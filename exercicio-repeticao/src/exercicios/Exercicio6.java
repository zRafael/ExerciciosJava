package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Integer numero;
		Double soma = 0.0, media, contador = 0.0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número qualquer: ");
			numero = ler.nextInt();
			
			if(numero%3==0) {
				soma = soma + numero;
				contador++;
			}
			media = soma / contador;
			
		}while(numero > 0);
		
		System.out.println("A media dos números multiplos de 3 é: " + media );
	}

}
