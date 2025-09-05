package strings;

/*
 * Recebendo um array de string, inverte as PALAVRAS
 * 1-identificar a primeira palavra - 1 espaço vazio seria o fim da primeira
        -------------
        C|A|T| |A|R|T|
        -------------
*/

public class InverterApenasPalavras {
    public static void main(String[] args) {

        String[] arr = { "C", "A", "R", " ", "A", "R", "T" };

        int left = 0;
        int right = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i].equals(" ")) {
                right = i - 1;

                while (left < right) {
                    String troca = arr[left];
                    arr[left] = arr[right];
                    arr[right] = troca;
                    left++;
                    right--;
                }

                left = i + 1;

            }
        }

        for (String l : arr) {
            System.out.print(l);
        }

        /*
         * System.out.println(arr.length);
         * System.out.println(arr[1]);
         * System.out.println(arr);
         * 
         * 
         */
    }

}
