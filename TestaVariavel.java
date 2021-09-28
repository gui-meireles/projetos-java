
public class TestaVariavel {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		boolean acompanhado = true;
		
		// no Java 'or' = || / e 'and' = &&
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}
}
