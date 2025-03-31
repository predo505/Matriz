import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior, menor, soma = 0;

        //Lê os números
        System.out.println("Digite 10 números inteiros.");
        System.out.println("(Digite o número escolhido e aperte Enter, até que sejam digitados 10 números)");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        maior = menor = soma = numeros[0];

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            soma += num;
        }

        double media = (double) soma / 10;

        //Resultados
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}