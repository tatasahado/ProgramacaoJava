package EstruturasCondicionais;

/*
 * Crie um programa em Java que solicita ao usuário o comprimento de três lados de um 
 * triângulo. O programa deve determinar e imprimir o tipo de triângulo com base nas 
 * seguintes regras:
 * Equilátero: Se todos os três lados forem iguais.
 * Isósceles: Se exatamente dois lados forem iguais.
 * Escaleno: Se todos os três lados forem diferentes.
 */

public class Exe04 {
	
	public static void main(String[] args) {
		
		double ladoA = 2.1;
		double ladoB = 2.2;
		double ladoC = 2.3;
		
		if ((ladoC<=ladoA+ladoB) && (ladoB<=ladoA+ladoC)&& (ladoA<=ladoB+ladoC)) {
			System.out.println("É triangulo");
			if ((ladoA==ladoB)&& (ladoB==ladoC) ) {
				System.out.println("Equilátero");
			} else if ((ladoA!=ladoB)&& (ladoB!=ladoC)&& (ladoA!=ladoC) ) {
				System.out.println("Escaleno");				
			} else {
				System.out.println("Isósceles");					
			}
		} else {
			System.out.println("NAO é triangulo");
		}
	}

}
