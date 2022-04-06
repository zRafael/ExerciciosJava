package exercicio2;

public class Aviao {

	public String nomeEmpresa;
	public String tipo;
	public int velocidadeMaxima;

	public Aviao(String nomeEmpresa, String tipo, int velocidadeMaxima) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.tipo = tipo;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void escreverNome() {
		System.out.println(String.format("Nome da empresa: %s", nomeEmpresa));
		System.out.println(String.format("Tipo do avião: %s ", tipo));
		System.out.println(String.format("Velocidade Máxima: %d", velocidadeMaxima));
	}

}
