package EstruturasRepeticao;

public class Primo {

    public static void main(String[] args) {
        
        int numero = 7;
        int divisores = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        
        System.out.println("O número " + numero + " possui " + divisores + " divisores.");
        
        if (divisores == 2) {
            System.out.println("O número " + numero + " É PRIMO.");
        } else {
            System.out.println("O número " + numero + " NÃO É PRIMO.");
        }
    }
}
