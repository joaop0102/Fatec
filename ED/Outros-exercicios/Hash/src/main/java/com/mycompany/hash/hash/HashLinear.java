package com.mycompany.hash.hash;

public class HashLinear {
    private Hash[] tab;
    private int TAM_MAX;

    public HashLinear(int tam) {
        tab = new Hash[tam];
        TAM_MAX = tam;
        for (int i = 0; i < tam; i++)
            tab[i] = new Hash();
    }

    private int funcaohash(double chave) {
        return Math.abs((int) chave) % TAM_MAX;
    }

    public void insere(double item) {
        if (cheia()) {
            System.out.println("\n->ATENÇÃO: Tabela cheia");
            return;
        }

        int pos = funcaohash(item);
        int i = 0;

        while (i < TAM_MAX) {
            if (tab[pos].estado == Hash.Estado.LIVRE || tab[pos].estado == Hash.Estado.REMOVIDO) {
                tab[pos].item = item;
                tab[pos].estado = Hash.Estado.OCUPADO;
                System.out.println("-> Inserido em HASH[" + pos + "]");
                return;
            } else if (tab[pos].estado == Hash.Estado.OCUPADO && tab[pos].item == item) {
                System.out.println("\n->ATENÇÃO: Esse item já foi cadastrado");
                return;
            }

            pos = (pos + 1) % TAM_MAX;
            i++;
        }

        System.out.println("\n->ERRO: Não foi possível inserir");
    }

    public int busca(double chave) {
        int pos = funcaohash(chave);
        int i = 0;

        while (i < TAM_MAX) {
            if (tab[pos].estado == Hash.Estado.LIVRE) {
                return -1; // Parar se encontrar posição nunca usada
            }

            if (tab[pos].estado == Hash.Estado.OCUPADO && tab[pos].item == chave) {
                return pos;
            }

            pos = (pos + 1) % TAM_MAX;
            i++;
        }

        return -1; // Não encontrado
    }

    public void apaga(double chave) {
        int pos = busca(chave);
        if (pos != -1) {
            tab[pos].estado = Hash.Estado.REMOVIDO;
            System.out.println("-> Dado HASH[" + pos + "] removido");
        } else {
            System.out.println("-> Item não encontrado");
        }
    }

    public boolean cheia() {
        for (int i = 0; i < TAM_MAX; i++) {
            if (tab[i].estado != Hash.Estado.OCUPADO) {
                return false; // Há espaço: LIVRE ou REMOVIDO
            }
        }
        return true;
    }

    public void imprime() {
        for (int i = 0; i < TAM_MAX; i++) {
            if (tab[i].estado == Hash.Estado.OCUPADO) {
                System.out.println("Hash[" + i + "] = " + tab[i].item);
            }
        }
    }
}