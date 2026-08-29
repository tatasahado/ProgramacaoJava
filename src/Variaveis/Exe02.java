package Variaveis;

/*
 * Escreva um programa(classe) chamado exercicio2 que exiba o resultado de 
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
 */

public class Exe02 {

	public static void main(String[] args) {
		
		int soma = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
		
		System.out.println("soma= " + soma);
	
		// Bonus do prof Maluco
		soma = 0;
		for (int i=1; i<10; i++) {
			soma = soma + i;	
			System.out.println("soma= " + soma);
		}
		System.out.println("soma= " + soma);

	}

}
