package EstruturasRepeticao2;

public class Primo {
	
	public static void main(String[] args) {
		
	int numMax = 100000;
		
		for (int numero=1; numero <= numMax; numero++) {
			
			int soma=0;
			for (int div=1; div <=numero; div++) {
				if (numero%div==0) {
					soma++;
				}
				if (soma>2) {
					break;
				}
			}
			
			if (soma<=2) {
				System.out.println("O número " + numero + " é primo");
			} 
		}
	}
}
