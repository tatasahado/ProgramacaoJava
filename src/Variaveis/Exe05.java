package Variaveis;

/*
 * Suponha que um corredor corra 14 quilômetros em 45 minutos e 30 segundos. 
 * Escreva um programa(classe) chamado exercicio5  * que exiba sua 
 * velocidade média em km/h.
 */

public class Exe05 {

	public static void main(String[] args) {
		
		double distancia = 14; // km
		double tempo = 45.5/60; // horas
		
		double vm = distancia / tempo;
		
		System.out.println("vm= " + vm + " km/h");

	}

}
