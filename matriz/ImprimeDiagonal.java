import java.util.Scanner;

public class ImprimeDiagonal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tam = entrada.nextInt();
        int matriz[][] = new int[tam][tam];

        // criando a matriz - O(n*2)
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        printDiagonalPrincipal(matriz);

        entrada.close();
    }

    public static void printDiagonalPrincipal(int[][] matriz) {
        int inicio = matriz.length; // valor total da matriz

        // matriz[linha i][coluna i] => pega elemento da linha i e da coluna i
        // so percorre quando linha = coluna (so a diagonal pricipal)

        for (int i = 0; i < inicio; i++) {
            /*
             * 1 - 0 -> valor linha 0 e valor coluna 0
             * 2 - 1 -> valor linha 1 e valor coluna 1
             * 3 - 2 -> valor linha 2 e valor coluna 2
             */

            System.out.print(matriz[i][i] + " ");
        }
        // O(n)porque o número de iterações é igual ao tamanho da matriz

    }

}