package EstruturasRepeticao2;

import java.util.Scanner;

public class Menu2 {
	
	public static void main(String[] args) {
		
		int opcao;

		Scanner input = new Scanner(System.in);

		do {
			// Menu
			System.out.println("***MENU***");
			System.out.println("1 - Imprime GABRIELLE");
			System.out.println("2 - Imprime VIVIANE");
			System.out.println("3 - Imprime TAISSA");
			System.out.println("4 - Imprime YURI");
			System.out.println("0 - Sair");

			System.out.print("Entre com a opcao:");
			opcao = input.nextInt();

			// Trata Opcao
			if (opcao == 0) {
				break;
			} else if (opcao == 1) {
				System.out.println("GABRIELLE");
			} else if (opcao == 2) {
				System.out.println("VIVIANE");
			} else if (opcao == 3) {
				System.out.println("TAISSA");
			} else if (opcao == 4) {
				System.out.println("YURI");
			} else {
				System.out.println("Opcao INVALIDA!!!!!!");
			}
		} while (opcao != 0);

		System.out.println("FIM DO PROGRAMA");
		
		input.close();
	}
}
