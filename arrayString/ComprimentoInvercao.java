package arrayString;

import java.util.Scanner;

public class ComprimentoInvercao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        // converter string em stringbuilder
        StringBuilder inversa = new StringBuilder(frase);
        // apos converter, inverte
        inversa.reverse(); // metodo

        // Converter de novo para string
        String invertida = inversa.toString();
        System.out.println(invertida);

        int comprimento = frase.length();
        System.out.print(comprimento);

        sc.close();
    }
}
