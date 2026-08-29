package Variaveis;

/*
 * Escreva um programa (classe) chamado exercicio4 que exiba a área e 
 * o perímetro de um retângulo com largura de 4,5 e altura de 7,9 usando 
 * variáveis "largura" e "altura" do tipo double. 
 * Use a seguinte fórmula:
	área = largura * altura e perimetro = 2 * (largura + altura)
 */

public class Exe04 {

	public static void main(String[] args) {
		
		double largura = 4.5;
		double altura = 7.9;
		
		double area = largura * altura;
		double perimetro = 2*(largura + altura);
		
		System.out.println("area: "+ area);
		System.out.println("perimetro: "+ perimetro);
		
		//opcao 2
		System.out.println("area: "+ (largura * altura));
		System.out.println("perimetro: "+ (2*(largura + altura)));		

	}

}
