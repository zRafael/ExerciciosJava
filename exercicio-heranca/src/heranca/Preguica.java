package heranca;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);
	}
	
	public void subirArvore() {
		System.out.println("Subindo...");
	}

}