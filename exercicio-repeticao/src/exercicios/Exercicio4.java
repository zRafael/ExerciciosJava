package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Integer idade;
		Integer sexo, feminino = 0, masculino = 0, outros = 0;
		Integer temperamento, calma = 0, nervosa = 0, agressiva = 0;
		Integer mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosas40anos = 0, calmasMenos18 = 0;
		Integer totalPessoas = 0;
		Scanner ler = new Scanner(System.in);

		while (totalPessoas != 6) {

			System.out.println("Qual a sua idade: ");
			idade = ler.nextInt();
			System.out.println("Qual seu sexo:(1-Feminino / 2-Masculino / 3-Outros)");
			sexo = ler.nextInt();
			System.out.println("Qual temperamento você tem:(1-Calma / 2- Nervosa / 3- Agressiva)");
			temperamento = ler.nextInt();

			if (sexo == 1) {
				feminino++;
			} else if (sexo == 2) {
				masculino++;
			} else if (sexo == 3) {
				outros++;
			}

			if (temperamento == 1) {
				calma++;
			} else if (temperamento == 2) {
				nervosa++;
			} else if (temperamento == 3) {
				agressiva++;
			}

			if (sexo == 1 && temperamento == 2) {
				mulheresNervosas++;
			}
			if (sexo == 2 && temperamento == 3) {
				homensAgressivos++;
			}
			if (sexo == 3 && temperamento == 1) {
				outrosCalmos++;
			}
			if (temperamento == 2 && idade > 40) {
				nervosas40anos++;
			}
			if (temperamento == 1 && idade < 18) {
				calmasMenos18++;
			}
			totalPessoas++;

		}

		System.out.println("\nNúmero de pessoas calmas: " + calma);
		System.out.println("\nNúmero de mulheres nervosas: " + mulheresNervosas);
		System.out.println("\nNúmero de homens agressivos: " + homensAgressivos);
		System.out.println("\nNúmero de outros calmos: " + outrosCalmos);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40: " + nervosas40anos);
		System.out.println("\nNúmero de pessoas calmas com menos de 18: " + calmasMenos18);

	}
}
