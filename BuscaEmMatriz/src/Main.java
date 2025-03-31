import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        //Variável
        int numeroEscolhido;

        //Usuário faz a matriz
        System.out.println("Digite 9 números para preencher uma matriz 3 por 3.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        //Mostra a matriz do usuário
        System.out.println("\nSua matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        //Pede um número a ser procurado
        System.out.println("\nDigite o número que deseja procurar na matriz: ");
        numeroEscolhido = scanner.nextInt();
        boolean escolhido = false;

        //Procura o número escolhido

        do {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] == numeroEscolhido) {
                        System.out.println("O número " + numeroEscolhido + " foi encontrado na posição [" + i + "][" + j + "].");
                        escolhido = true;
                    }
                }
            }
            if (!escolhido) {
                System.out.println("Este número não foi encontrado na matriz.");
                System.out.println("Tente novamente.");
                numeroEscolhido = scanner.nextInt();
            }
        } while (!escolhido);

        scanner.close();
    }
}