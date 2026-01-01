package com.mycompany.fila2;

public class Fila {
    private Object[] objetos = new Object[10];
    private int inicio = 0;  
    private int totalDeObjetos = 0;

    public void enfileira(Object objeto) {
        if (totalDeObjetos == objetos.length) {
            System.out.println("Erro: A fila está cheia!");
            return;
        }
        
        int fim = (inicio + totalDeObjetos) % objetos.length; // Calcula a posição do novo elemento
        objetos[fim] = objeto;
        totalDeObjetos++;
    }

    public void desenfileira() {
        if (totalDeObjetos > 0) {
            inicio = (inicio + 1) % objetos.length; // Avança o índice de início
            totalDeObjetos--;
        } else {
            System.out.println("Erro: A Fila está vazia!");
        }
    }

    public Object primeiro() {
        if (totalDeObjetos > 0) {
            return objetos[inicio]; // Retorna o primeiro elemento da fila
        } else {
            return null;
        }
    }

    public Object ultimo() {
        if (totalDeObjetos > 0) {
            int ultimoIndex = (inicio + totalDeObjetos - 1) % objetos.length;
            return objetos[ultimoIndex]; // Retorna o último elemento da fila
        } else {
            return null;
        }
    }

    public int tamanho() {
        return totalDeObjetos;
    }

    public boolean vazia() {
        return totalDeObjetos == 0;
    }
}