/*
 * Limite de Carga: Crie a classe ElevadorCarga. Declare int peso = 0. Enquanto o peso for 
 * menor que 100, adicione 20 ao peso e imprima: "Peso atual: [valor]kg". 
 */
package EstruturasRepeticao2;

public class ElevadorCarga {

	public static void main(String[] args) {
		
		int peso = 0;
		
		while (peso < 100) {
			System.out.println("Peso atual: " + peso + "kg");
			peso = peso + 20; //peso+=20
		}
		
		System.out.println("Peso final: " + peso);

	}

}
