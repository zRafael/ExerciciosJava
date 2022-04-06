package exercicio5;

public class Patinete {

	public String marca;
	public Double preco;

	public Patinete(String marca, Double preco) {
		super();
		this.marca = marca;
		this.preco = preco;
	}

	public void escreverNome() {
		System.out.println(String.format("Marca do Patinete: %s", marca));
		System.out.println(String.format("Preço do produto: %.2f", preco));
	}
}
