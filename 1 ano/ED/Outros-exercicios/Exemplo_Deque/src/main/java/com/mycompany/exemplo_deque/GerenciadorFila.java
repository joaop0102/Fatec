package com.mycompany.exemplo_deque;

class GerenciadorFila {
    private String[] fila; 
    private int capacidade; 
    private int tamanho; 

    public GerenciadorFila(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new String[capacidade];
        this.tamanho = 0; 
    }

    public void adicionarNoInicio(String nome) {
        if (tamanho == capacidade) {
            System.out.println("Fila cheia! Não é possível adicionar.");
            return;
        }
        // Desloca os elementos existentes para a direita
        for (int i = tamanho; i > 0; i--) {
            fila[i] = fila[i - 1];
        }
        fila[0] = nome; // Inclui o novo elemento na primeira posição
        tamanho++;
        System.out.println(nome + " entrou no início da fila.");
    }

   
    public void adicionarNoFim(String nome) {
        if (tamanho == capacidade) {
            System.out.println("Fila cheia! Não é possível adicionar.");
            return;
        }
        fila[tamanho] = nome; // Insere o elemento na última posição disponível
        tamanho++;
        System.out.println(nome + " entrou no fim da fila.");
    }

    // AtenderProximo faz a remoção do primeiro elemento da fila
    public void atenderProximo() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.println("Atendendo: " + fila[0]);
        // Desloca os elementos para a esquerda
        for (int i = 0; i < tamanho - 1; i++) {
            fila[i] = fila[i + 1];
        }
        fila[tamanho - 1] = null; // Remove o último valor após deslocamento
        tamanho--;
    }

    public void removerDoFim(String nome) {
        if (tamanho == 0) {
            System.out.println("A fila está vazia.");
            return;
        }
        // Verifica se o último elemento da fila é o nome informado
        if (fila[tamanho - 1].equals(nome)) {
            System.out.println("Removendo do fim: " + nome);
            fila[tamanho - 1] = null; // Remove o último elemento
            tamanho--;
        } else {
            System.out.println(nome + " não está na última posição da fila.");
        }
    }

    // Informa o estado atual da fila
    public void exibirFila() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia.");
            return; // Sai do método para evitar impressão de elementos inexistentes
        }

        System.out.print("Fila atual: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println();
    }
}