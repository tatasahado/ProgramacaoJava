package EstruturasRepeticao;

public class SomadePares {
	
	public static void main(String[] args) {
		
		int soma = 0;
		for (int num = 1; num <= 20; num++) {
			if ((num % 2) == 0) {
				System.out.println(num);
				soma = soma + num;
			}
		}
		System.out.println("Soma: " + soma);

		// opcao 2
		soma = 0;
		for (int num = 0; num <= 20; num+=2) { // num+=2 => num = num + 2
			System.out.println(num);
			soma = soma + num;
		}
		System.out.println("Soma: " + soma);
	}

}
