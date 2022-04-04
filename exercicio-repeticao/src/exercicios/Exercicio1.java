package exercicios;

public class Exercicio1 {

	public static void main(String[] args) {

		System.out.println("Mostrando números de 1000 a 1999 que divididos por 11 obtemos resto 5");

		for (Double numero = 1000.0; numero < 2000; numero++) {

			if (numero % 11 == 5) {
				System.out.println(numero);
			}

		}
	}

}
