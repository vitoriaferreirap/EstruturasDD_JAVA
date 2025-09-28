import java.util.ArrayList;
import java.util.List;

public class ListaDinamica {
    public static void main(String[] args) {

        // criando lista
        List<String> animais = new ArrayList<>();

        // add na lista
        animais.add("Macaco");
        animais.add("Leao");
        animais.add("Girafa");

        System.out.println("Lista: " + animais);

        // recupera da lista
        System.out.println("Animal no indice 1: " + animais.get(1));

        // remove da lista
        System.out.println("Animal removido do indice 0: " + animais.remove(0));
        System.out.println("Lista: " + animais);

        // tamanho da lista
        System.out.println(animais.size());

        // imprimindo com for-eath
        for (String a : animais) {
            System.out.println(a);
        }

        // percorrer lista
        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i) == "Girafa") {
                System.out.println("indice do que busco: " + i);
            }
        }

        // editar uma posicao
        animais.set(0, "Tartatura");
        System.out.println("Lista Editada: " + animais);
    }
}