package EstruturasRepeticao;

public class Tabuada {
	
	public static void main(String[] args) {
		
		int numero = 4;
		System.out.println("Tabuada de " + numero);
		for (int i=1; i<=10; i++) {
			System.out.println(numero+ "x" + i + "="+ numero*i);
		}
	}

}
