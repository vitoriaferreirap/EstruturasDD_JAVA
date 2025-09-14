package arrayString;

import java.util.Scanner;

class FrequenciaDePalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();
        String pesquisa = sc.nextLine();

        int contador = 0;

        // descobrir tamanho da palavra que busco
        int tamPalavra = texto.length() - pesquisa.length();

        // palavras maiores nao entraram
        // percoree a frase comparando em substrings do tamanho da palavra
        for (int i = 0; i <= tamPalavra; i++) {
            // cria substringo do texto no comprimento da pesquisa
            // apos isso compara a substring com a pesquisa
            if (texto.substring(i, i + pesquisa.length()).equals(pesquisa)) {
                contador++;
            }
        }
        System.out.print(pesquisa + "=" + contador);

        sc.close();

    }

}