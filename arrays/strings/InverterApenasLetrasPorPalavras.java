
/*
 * Cada palavra permanece na sua posição, mas com as letras invertidas.
 * 1-identificar a primeira palavra - 1 espaço vazio seria o fim da primeira
        -------------
        C|A|T| |A|R|T|
        -------------
*/

public class InverterApenasLetrasPorPalavras {
    public static void main(String[] args) {

        String[] arr = { "C", "A", "R", " ", "A", "R", "T" };

        int left = 0;
        int right = 0;

        // maior índice válido é sempre arr.length - 1.
        // se length = 7 logo apos ultimo elemento, os índices vão de 0 até 6.

        for (int i = 0; i <= arr.length; i++) { // length disponibiliza tamanho entao i < 7
            if (i == arr.length || arr[i].equals(" ")) {
                right = i - 1; // pega o que esta no indice 6

                while (left < right) {
                    String troca = arr[left];
                    arr[left] = arr[right];
                    arr[right] = troca;
                    left++;
                    right--;
                }

                // depois de inverter
                left = i + 1; // 3 + 1 = 4 inicio da segunda palavra

            }
        }

        for (String l : arr) {
            System.out.print(l);
        }

        /*
         * System.out.println(arr.length); tamanho = 7
         * System.out.println(arr[1]); indices vai de 0 a 6
         * System.out.println(arr); endereço de memoria
         * 
         * 
         */
    }

}
