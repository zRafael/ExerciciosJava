package exercicio1;

public class Cliente {

	public String nome;
	public int idade;
	public String sexo;

	public Cliente(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public void escreverNome() {
		System.out.println(String.format("Seu Nome: %s", nome));
		System.out.println(String.format("Sua Idade: %d ", idade));
		System.out.println(String.format("Seu sexo: %s", sexo));
	}

}
