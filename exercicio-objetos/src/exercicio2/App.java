package exercicio2;

public class App {

	public static void main(String[] args) {

		Aviao aviao1 = new Aviao("Gol", "Jato", 300);
		Aviao aviao2 = new Aviao("Boeing 717", "SuperSônico", 500);

		aviao1.escreverNome();
		aviao2.escreverNome();
	}
}
