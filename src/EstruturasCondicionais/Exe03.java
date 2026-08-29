package EstruturasCondicionais;

/*
 * Crie um programa que recebe a nota de um aluno, um valor inteiro de 0 a 100, e 
 * imprime a sua classificação com base nos seguintes critérios:
 * 90 a 100: Excelente
 * 75 a 89: Bom
 * 60 a 74: Regular
 * 0 a 59: Insuficiente
 */

public class Exe03 {

	public static void main(String[] args) {
		
		int nota = 58;
		
		if (nota >= 90 ) {
			System.out.println("Excelente");
		} else if (nota >= 75) {
			System.out.println("Bom");
		} else if (nota >= 60) {
			System.out.println("Regular");			
		} else {
			System.out.println("Insuficiente");		
		}

	}

}
