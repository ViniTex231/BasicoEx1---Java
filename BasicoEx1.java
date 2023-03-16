import java.util.Scanner;
public class BasicoEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão digitados? ");
        int qtd = sc.nextInt();

        int[] vetor = new int[qtd];

        System.out.println("Digite os valores: ");
        for (int i = 0; i < qtd; i++) {
            vetor[i] = sc.nextInt();
        }
        double soma = 0;
        for (int i = 0; i < qtd; i++) {
            soma += vetor[i];
        }
        double media = soma / qtd;

        System.out.println("A média dos resultados é: " + media);

    }
}
