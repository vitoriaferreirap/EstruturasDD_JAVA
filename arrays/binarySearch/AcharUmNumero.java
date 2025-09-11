// so confuciona para arr ordenados - busca binaria

//usar tecnica de dois ponteiros, ajuda a nao ficar recriando novos arrys, mantendo O(1) 

public class AcharUmNumero {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int num = 8;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // atualizar o meio
            int meio = (left + right) / 2;

            if (arr[meio] >= num) { // valor no array no indece meio(4)
                right = meio; // ponteiro right aponta para o índice 4
                if (arr[right] == num) {
                    System.out.println("O indice : " + right + " tem o valor de : " + arr[right]);
                    break;
                }
            } else {
                // ignorar o próprio meio e todos os índices à esquerda dele
                left = meio - 1;
            }
        }

    }
}
