package exercicio4;

public class Funcionario {

	public String nome;
	public int idade;
	public Double salario;

	public Funcionario(String nome, int idade, Double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public void escreverNome() {
		System.out.println(String.format("Nome do funcion�rio: %s", nome));
		System.out.println(String.format("Idade do funcion�rio: %d ", idade));
		System.out.println(String.format("Ano do lan�amento do produto: %.2f", salario));
	}
}
