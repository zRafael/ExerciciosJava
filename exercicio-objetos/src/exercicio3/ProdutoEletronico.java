package exercicio3;

public class ProdutoEletronico {

	public String nome;
	public String tipo;
	public int anoLancamento;

	public ProdutoEletronico(String nome, String tipo, int anolancamento) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.anoLancamento = anolancamento;
	}

	public void escreverNome() {
		System.out.println(String.format("Nome do produto: %s", nome));
		System.out.println(String.format("Tipo do produto: %s ", tipo));
		System.out.println(String.format("Ano do lançamento do produto: %d", anoLancamento));
	}

}
