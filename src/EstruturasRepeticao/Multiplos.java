package EstruturasRepeticao;

public class Multiplos {
	
	public static void main(String[] args) {
		
		int numero = 17;
		
		System.out.println("Múltiplos de " + numero);
		for (int num=0; num<=100; num++) {
			if (num%numero==0) {
				System.out.println(num);
			}
		}
	}

}
