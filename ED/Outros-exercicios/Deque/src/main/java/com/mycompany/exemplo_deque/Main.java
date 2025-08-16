package com.mycompany.exemplo_deque;

public class Main {
    public static void main(String[] args) {
        // Criando um deque com capacidade para 5 elementos
        Deque deque = new Deque(5);
        // Adicionando elementos
        // Adicionando elementos
        deque.adicionarNoInicio("Alice");
        deque.adicionarNoFim("Bob");
        deque.adicionarNoInicio("Charlie");
        deque.adicionarNoFim("David");
        deque.adicionarNoInicio("Eve");

        System.out.println();
        deque.exibirDeque();
        System.out.println();

        // Tentando adicionar em um deque cheio
        deque.adicionarNoFim("Frank"); // Deve exibir mensagem de deque cheio

        System.out.println();

        // Removendo elementos
        deque.removerDoInicio();
        System.out.println();
        deque.exibirDeque();
        System.out.println();

        deque.removerDoFim();
        System.out.println();
        deque.exibirDeque();
        System.out.println();

        // Testando limites
        deque.removerDoInicio();
        System.out.println();
        deque.removerDoInicio();
        System.out.println();
        deque.removerDoInicio(); // Deve exibir mensagem de deque vazio
        System.out.println();
        
        deque.exibirDeque();
    }
}
