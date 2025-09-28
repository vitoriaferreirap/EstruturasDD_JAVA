import java.util.LinkedList;
import java.util.Queue;

public class EnqueueDequeue {
    public static void main(String[] args) {

        // criando uma fila (queue) - usa-se lista simples (LinkedList)
        // primeiro entrar, primeiro a sair
        Queue<String> carros = new LinkedList<>();

        if (carros.isEmpty()) {
            System.out.println("Fila esta vazia!");
        }

        // enfileirar
        carros.add("Gol");
        carros.add("HB20");
        carros.add("Saveiro");
        carros.add("Ford K");

        // achar o topo da fila
        System.out.println("Topo da fila/PrimeiroElemento: " + carros.peek());
        System.out.println("Lista: " + carros);
        // remover
        System.out.println("Primeiro a sair: " + carros.remove());
        System.out.println("Segundo a sair: " + carros.remove());

    }
}