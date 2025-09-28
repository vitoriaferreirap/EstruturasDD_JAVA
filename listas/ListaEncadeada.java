import java.util.LinkedList;

public class ListaEncadeada {
    public static void main(String[] args) {
        // criando a lista duplamente encadeada - percorre de frente e de tras
        LinkedList<String> lista = new LinkedList<>();

        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Elemento indice 3: " + lista.get(3));

        // percorrer lista da frente
        for (String a : lista) {
            System.out.print(a + " ");
        }
        System.err.println();
        // percorrer de tras para frente
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i) + " ");
        }
    }
}
