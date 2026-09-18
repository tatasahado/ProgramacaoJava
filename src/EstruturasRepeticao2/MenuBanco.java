package EstruturasRepeticao2;

import java.util.Scanner;

public class MenuBanco {

	public static void main(String[] args) {
		int opcao;

		Scanner input = new Scanner(System.in);

		do {
			// Menu
			System.out.println("***MENU***");
			System.out.println("1 - Ver Saldo");
			System.out.println("2 - Sacar");
			System.out.println("3 - Sair");

			System.out.print("Entre com a opcao:");
			opcao = input.nextInt();

			// Trata Opcao
			if (opcao == 3) {
				break;
			} else if (opcao == 1) {
				System.out.println("Saldo");
			} else if (opcao == 2) {
				System.out.println("Sacar");
			} else {
				System.out.println("Opcao INVALIDA!!!!!!");
			}
		} while (opcao != 3);

		System.out.println("FIM DO PROGRAMA");
		
		input.close();
	}
}