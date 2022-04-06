package exercicio3;

public class App {

	public static void main(String[] args) {

		ProdutoEletronico produto1 = new ProdutoEletronico("Notebook", "Gamer", 2022);
		ProdutoEletronico produto2 = new ProdutoEletronico("Televisão", "HD", 2018);

		produto1.escreverNome();
		produto2.escreverNome();

	}
}
