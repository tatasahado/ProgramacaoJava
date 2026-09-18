/*
 * Sentinela: Crie um programa que solicita números ao usuário repetidamente e calcula a soma. 
 * O programa deve parar quando o usuário digitar "0".
 */

package EstruturasRepeticao2;

import java.util.Scanner;

public class Sentinela {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nota;
		double soma = 0;
		int contador =0;
		
		do {
			System.out.print("Entre com a Nota: ");
			nota = input.nextDouble();	
			if ((nota>10.0)|| (nota <0)) {
				System.out.println("Nota Invalida");
				continue;
			}
			
			soma = soma + nota;
			if (nota!=0) {
				contador++;			
			}
			
		} while (nota !=0);

		System.out.println("Soma: " + soma);
		System.out.println("Media: " + soma/contador);
		
		input.close();
	}

}