package com.mycompany.exemplo_deque;


class Deque {
    private String[] deque;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    //Método construtor
    public Deque(int capacidade) {
        this.capacidade = capacidade;
        this.deque = new String[capacidade];
        this.inicio = -1; //Indica que o deque está vázio
        this.fim = -1; // Indica que o deque está vázio
        this.tamanho = 0;
    }


    public boolean vazio() {
        return tamanho == 0;
    }

    public boolean cheio() {
        return tamanho == capacidade;
    }

    public void adicionarNoInicio(String nome) {
        if (cheio()) {
            System.out.println("O Deque está cheio!");
            return;
        } else if (vazio()) {
            inicio = fim = 0; //Define o inicio e fim como primeira posição do array
        } else {
            inicio = (inicio - 1 + capacidade) % capacidade; //Move o inicio uma posição apra trás
        }
        deque[inicio] = nome; //Elemento adicionado
        tamanho++; //Incrementa o tamanho
        System.out.println(nome + " Adicionado no início");
    }

    public void adicionarNoFim(String nome) {
        if (cheio()) {
            System.out.println("Deque Cheio!");
            return;
        } else if (vazio()) {
            inicio = fim = 0; //Define o inicio e fim como primeira posição do array
        } else {
            fim = (fim + 1) % capacidade; //Operação aritmética para controlar os índíces para nunca ficare fora dos Arrays
        }
        deque[fim] = nome; //Novo elemento no fim
        tamanho++; // Atualiza o contator
        System.out.println(nome + " adicionado no fim.");
    }

    public void removerDoInicio() {
        if (vazio()) {
            System.out.println("Deque vazio!"); //Caso esteja vazio, impede a remoção
            return;
        }
        System.out.println("Removendo do início: " + deque[inicio]);
        deque[inicio] = null;
        tamanho--;

        if (tamanho == 0) { // Se o deque ficou vazio, redefinir os índices
            inicio = -1;
            fim = -1;
        } else {
            inicio = (inicio + 1) % capacidade; // Move o início para a frente do array
        }
    }

    public void removerDoFim() {
        if (vazio()) {
            System.out.println("Deque está vazio!");
            return;
        }
        System.out.println("Removendo do fim: " + deque[fim]);
        deque[fim] = null;
        tamanho--;

        if (tamanho == 0) { // Se o deque ficou vazio, redefinir os índices
            inicio = -1;
            fim = -1;
        } else {
            fim = (fim - 1 + capacidade) % capacidade;
        }
    }

    public void exibirDeque() {
        if (vazio()) {
            System.out.println("O Deque está vazio!");
            return;
        }
        //Percorre os elementos
        System.out.print("Deque atual: ");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % capacidade;
            System.out.print(deque[index] + " ");
        }
        System.out.println();
    }
}