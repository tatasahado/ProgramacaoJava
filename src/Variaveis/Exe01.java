package Variaveis;

/*
 * Escreva um programa(classe) chamado exercicio1 que a partir de um inteiro 
 * a igual a 10, imprima seu sucessor e predecessor.
 */

public class Exe01 {

	public static void main(String[] args) {
		
		int num = 10;
		int sucessor = num +1;
		int antecessor = num -1;
		
		System.out.println("numero= " + num);
		
		//opção 1
		System.out.println("sucessor1= " + sucessor);
		System.out.println("antecessor1= " + antecessor);
		
		//opção 2
		System.out.println("sucessor2= " + (num+1) );
		System.out.println("antecessor2= " + (num-1) );

	}

}
