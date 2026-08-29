package Variaveis;

public class TesteOperadoresIncrementoDecremento2 {

	public static void main(String[] args) {
		
		int i = 5;
        int j = 8;

        int x = ++i;
        int y = j++;

        int z = --i;
        int w = j--;

        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        System.out.println("Valor de z: " + z);
        System.out.println("Valor de w: " + w);

	}

}
