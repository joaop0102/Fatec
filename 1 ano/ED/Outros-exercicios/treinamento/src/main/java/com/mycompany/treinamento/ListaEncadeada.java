/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinamento;

/**
 *
 * @author jp
 */
public class ListaEncadeada {  
    private Celula primeiro;  
    private Celula ultimo;  
    private Celula posicaoAtual;  

    /**   
     * Adiciona uma pessoa no fim da lista.  
     * @param valor  
     */  
    public void adicionar(Pessoa valor) {  
        Celula celula = new Celula();  
        celula.setValor(valor);  
        if (primeiro == null && ultimo == null) {  
            primeiro = celula;  
            ultimo = celula;  
        } else {  
            ultimo.setProximo(celula);  
            ultimo = celula;  
        }  
    }  

    /**  
     * Remove uma pessoa do fim da lista.  
     */  
    public void remover() {  
        if (primeiro.getProximo() != null) {  
            Celula celula = this.recuperarPenultimo(this.primeiro);  
            ultimo = celula;  
            celula.setProximo(null);  
        } else {  
            primeiro = ultimo = null;  
        }  
    }  

    /**  
     * Recupera o penúltimo elemento da lista  
     * @param celula  
     * @return  
     */  
    private Celula recuperarPenultimo(Celula celula) {  
        if (celula.getProximo().equals(ultimo)) {  
            return celula;  
        }  
        return recuperarPenultimo(celula.getProximo());  
    }  

    public boolean temProximo() {  
        if (primeiro == null) {  
            return false;  
        } else if (posicaoAtual == null) {  
            posicaoAtual = primeiro;  
            return true;  
        } else {  
            boolean temProximo = posicaoAtual.getProximo() != null;  
            posicaoAtual = posicaoAtual.getProximo();  
            return temProximo;  
        }  
    }  

    public Celula getPosicaoAtual() {  
        return this.posicaoAtual;  
    }  
}