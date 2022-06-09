import java.util.Scanner;

public class ParImpar {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro");
        numero = entrada.nextInt();

        //Verifica se o número é par
        if ((numero % 2) == 0) {
            System.out.println("O número " + numero + " é par");
        }
        else {
            System.out.println("O número " + numero + " é ímpar");
        }
        entrada.close();
    }
}
