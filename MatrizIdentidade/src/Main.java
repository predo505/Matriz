public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };

        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

    }
}