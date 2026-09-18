package EstruturasRepeticao;

public class Divisores {
	
	public static void main(String[] args) {
		
		int numero = 6779;
		
		for (int div=1; div <=numero; div++) {
			if (numero%div==0) {
				System.out.println(div + " é divisor de " + numero);
			}
		}
	}

}
