package exercicio1;

public class App {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Rafael", 18, "Masculino");
		Cliente cliente2 = new Cliente("Melissa", 19, "Feminino");

		cliente1.escreverNome();
		cliente2.escreverNome();
	}
}
