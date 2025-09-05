package strings;

/*temos uma string e queremos inverter todas as Letras da Palavra e a Palavra nesse texto 
-------------
C|A|T| |A|R|T|
-------------
*/
public class InverterLetrasEPalavras {
    public static void main(String[] args) {

        String[] arr = { "C", "A", "R", " ", "A", "R", "T" };

        // representa indice do array
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // verificar se não é uma posicao vazio, se for pula e nao faz troca
            if (arr[left].equals(" ")) {
                left++;
                continue;// pula o resto do codigo e retorna pro wilhe
            }

            if (arr[right].equals(" ")) {
                right--;
            }

            String troca = arr[right];
            arr[right] = arr[left];
            arr[left] = troca;
            left++;
            right--;
        }

        // O(n)
        for (String posicao : arr) {
            System.out.print(posicao);
        }

    }
}