package exercicio6;

public class ContaBancaria {

	public String nome;
	public Double saldo;
	public Boolean ativo;

	public ContaBancaria(String nome, Double saldo, Boolean ativo) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.ativo = ativo;
	}

	public void escreverClasse() {
		System.out.println(String.format("Nome do titular: %s", nome));
		System.out.println(String.format("Seu saldo: %.2f", saldo));
		System.out.println(String.format("Usado esse mês: %s", ativo));
	}

}
