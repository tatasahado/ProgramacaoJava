package EstruturasRepeticao2;

import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int numero;
		
//		for (int i = 0; i < 6; i++) {
//			numero = rd.nextInt(61);
//			System.out.println(numero);		
//		}
		
		do {
			numero = rd.nextInt(61);
			System.out.println(numero);				
		} while (numero !=5);

	}

}
