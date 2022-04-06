package exercicio7;

public class App {

	public static void main(String[] args) {

		Paciente paciente1 = new Paciente("Rafael", "Leve", 18);
		Paciente paciente2 = new Paciente("Jubiscleido", "Critico", 89);

		paciente1.escreverClasse();
		paciente2.escreverClasse();
	}

}
