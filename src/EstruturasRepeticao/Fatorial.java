package EstruturasRepeticao;

public class Fatorial {
	
	public static void main(String[] args) {
		
		int numero = 17;
		
		long fatorial = 1;
		for (int i=numero;i > 0; i--) {
			fatorial = fatorial*i;
		}
		
		System.out.println(numero+"!="+ fatorial);
	}

}
