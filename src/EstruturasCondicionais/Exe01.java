package EstruturasCondicionais;

/*
 * Crie uma classe chamada TesteIfElseifElse2 no projeto estruturascondicionais 
 * que receba o salário base de um empregado em uma variável e calcule / 
 * imprima o valor do imposto de renda a pagar com base nas seguintes condições
 * Imposto de renda = (Salário Base * Alíquota) - Dedução
 */

public class Exe01 {

	public static void main(String[] args) {
		
		double salarioBase = 4000.0;

		double impostoRenda;
		double aliquota = 0;
		double deducao = 0;

		if (salarioBase >= 4664.68) {
			aliquota = 0.275;
			deducao = 869.36;
		} else if (salarioBase >= 3751.06) {
			aliquota = 0.225;
			deducao = 636.13;
		} else if (salarioBase >= 2826.66) {
			aliquota = 0.15;
			deducao = 354.80;
		} else {
			aliquota = 0;
			deducao = 0;
		}

		impostoRenda = salarioBase * aliquota - deducao;

		System.out.println("Salario Bruto: " + salarioBase);
		System.out.println("Imposto: " + impostoRenda);
		System.out.println("Salario Liquido: " + (salarioBase-impostoRenda));

	}

}
