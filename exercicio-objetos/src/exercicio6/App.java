package exercicio6;

public class App {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria("Rafael", 30000.00, true);
		ContaBancaria conta2 = new ContaBancaria("Melissa", 10000.00, false);

		conta1.escreverClasse();
		conta2.escreverClasse();
	}
}
