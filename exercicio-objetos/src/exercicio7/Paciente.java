package exercicio7;

public class Paciente {

	public String nome;
	public String estado;
	public int idade;

	public Paciente(String nome, String estado, int idade) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.idade = idade;
	}

	public void escreverClasse() {
		System.out.println(String.format("Nome do titular: %s", nome));
		System.out.println(String.format("Estado do paciente: %s", estado));
		System.out.println(String.format("Idade do paciente: %s", idade));
	}
}
