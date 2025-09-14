package arrayString;

import java.util.Scanner;

public class ComparaCharEString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // contadores de vogais
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        while (sc.hasNextLine()) {
            String frase = sc.nextLine();

            // percorre cada caracter da linha
            for (int j = 0; j < frase.length(); j++) {
                char c = Character.toUpperCase(frase.charAt(j)); // trata maiúsculas e minúsculas

                if (c == 'A') {
                    a++;
                } else if (c == 'E') {
                    e++;
                } else if (c == 'I') {
                    i++;
                } else if (c == 'O') {
                    o++;
                } else if (c == 'U') {
                    u++;
                }
            }

            // compara se tem o mesmo conteudo - comparacao string
            if (frase.equals("FIM")) {
                // imprime os contadores do bloco
                System.out.println("a=" + a);
                System.out.println("e=" + e);
                System.out.println("i=" + i);
                System.out.println("o=" + o);
                System.out.println("u=" + u);

                // resetar contadores para o próximo bloco
                a = e = i = o = u = 0;
            }
        }

        sc.close();
    }
}
