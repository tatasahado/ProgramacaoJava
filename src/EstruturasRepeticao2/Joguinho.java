package EstruturasRepeticao2;

import java.util.Random;
import java.util.Scanner;

public class Joguinho {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner input = new Scanner(System.in);
		
		int numero = rd.nextInt(101); //programa escolhe aleatoriamente o numero
		int palpite;
		
		do {
			System.out.print("Entre com seu palpite:");
			palpite = input.nextInt();
			
			if (palpite > numero) {
				System.out.println("Palpite está acima");
			} else if (palpite < numero) {
				System.out.println("Palpite está abaixo");
			} else {
				System.out.println("Voce ACERTOU!!");
			}
			
		} while(palpite != numero);
		
		System.out.println("FIM DO PROGRAMA");
		
		input.close();
	}
}
