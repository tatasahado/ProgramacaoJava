package Variaveis;

/*
 * Escreva um programa (classe) chamado exercicio3 que exiba a área e o perímetro
 *  de um círculo que tem um raio de 5,5 usando uma variável tipo float chamada 
 *  "raio". Use a seguinte fórmula:
	perímetro = 2 * raio * pi
	área = raio * raio * pi
	Defina pi = 3.14159
 */

public class Exe03 {

	public static void main(String[] args) {
		
		double raio = 5.5;
		double pi = 3.14159;
		
		double area = raio * raio * pi;
		double perimetro = 2 * raio * pi;
		
		System.out.println("O círculo de raio " + raio + " tem:");
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);		
		

	}

}
