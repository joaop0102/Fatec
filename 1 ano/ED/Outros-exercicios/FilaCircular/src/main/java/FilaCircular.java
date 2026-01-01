public class FilaCircular {
        private No cabeca = null; //começa sem nenhum numero
        private No ultimo = null; // ultimo numero tambem nao existe ainda

        public void adicionar(int dado) {
            No novoNo = new No(dado);
            if (cabeca == null) {
                cabeca = novoNo; // aqui aparece o primeiro numero,
                ultimo = novoNo; // entao esse novo numero tambem é o ultimo
                ultimo.proximo = cabeca; // Aponta para o início, formando o círculo
            } else {
                ultimo.proximo = novoNo;
                ultimo = novoNo;
                ultimo.proximo = cabeca; // Mantém o círculo
            }
        }

        public void exibir() {
            if (cabeca == null) {
                System.out.println("Lista vazia");
                return;
            }
            No atual = cabeca;
            int contador = 0;
            do {
                System.out.print(atual.dado + " -> ");
                atual = atual.proximo;
                contador++;
                if (contador % tamanho() == 0) {
                    System.out.println("(volta ao início)\n"); // faz aquela "quebra/enter" no terminal
                }
            } while (contador < 2 * tamanho()); // Exibe duas vezes, deixa melhor a visualização
        }

        // (Tamanho) quantos nós existem na lista, ajudando a exibir corretamente
        // os elementos e identificar quando completar uma volta no círculo.
        public int tamanho() {
            if (cabeca == null) return 0;
            int tamanho = 0;
            No atual = cabeca;
            do {
                tamanho++;
                atual = atual.proximo;
            } while (atual != cabeca);
            return tamanho;
        }
    }
