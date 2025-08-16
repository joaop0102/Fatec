package com.mycompany.exemplo_deque;

public class Main {
    public static void main(String[] args) {
        GerenciadorFila fila = new GerenciadorFila(5);

        System.out.println("\n--- Adicionar elementos no início e no fim ---");
        fila.adicionarNoInicio("Carlos");
        fila.exibirFila();

        fila.adicionarNoFim("Ana");
        fila.exibirFila();

        fila.adicionarNoInicio("Mariana");
        fila.adicionarNoFim("João");

        fila.adicionarNoInicio("Fernanda");
        fila.exibirFila();

        System.out.println("\n--- Tentar adicionar em uma fila cheia ----");
        fila.adicionarNoFim("Pedro"); // Deve exibir uma mensagem de erro

        System.out.println("\n--- Remover do fim -----");
        fila.removerDoFim("João");
        fila.exibirFila();
        System.out.println("\n--- Segunda remoção do fim -----");
        fila.removerDoFim("Ana");
        fila.exibirFila();

        System.out.println("\n--- Atender a primeira pessoa ----");
        fila.atenderProximo();
        fila.exibirFila();

        System.out.println("\n--- Atender a próxima pessoa ---");
        fila.atenderProximo();
        fila.exibirFila();

        System.out.println("\n--- Remover até a fila ficar vazia ---");
        fila.atenderProximo();
        fila.exibirFila();

        fila.atenderProximo();
    }
}
