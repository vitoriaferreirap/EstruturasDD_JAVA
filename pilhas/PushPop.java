package pilhas;

import java.util.Stack;

public class PushPop {
    public static void main(String[] args) {

        // criando uma Pilha (stack)
        // ultimo a entrar, é o primeiro a sair
        Stack<String> pessoas = new Stack<>();

        if (pessoas.isEmpty()) {
            System.out.println("Pilha esta vazia!");
        }

        // empilhar
        pessoas.push("Amanda");
        pessoas.push("Joao");
        pessoas.push("Maria");
        pessoas.push("Roberta");

        // achar o topo da pilha
        System.out.println("Topo da Pilha/Ultimo Elemento: " + pessoas.peek());
        System.out.println("Pilha: " + pessoas);
        // desempilhar
        System.out.println("Primeiro a sair: " + pessoas.pop());
        System.out.println("Segundo a sair: " + pessoas.pop());

    }
}
