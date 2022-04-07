package heranca;

public class App {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro("Marley", 7, "Auauau!");
		Cavalo hourse = new Cavalo("Mickey", 10, "Hihihi!");
		Preguica preguica = new Preguica("Preguiçoso", 5, "zzzzz!");

		System.out.println(dog.getNome());
		System.out.println(hourse.getIdade());
		System.out.println(preguica.getSom());

	}
}
