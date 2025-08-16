/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinamento;

/**
 *
 * @author jp
 */
public class Principal {
     public static void main(String[] args) {  
        ListaEncadeada listaEncadeada = new ListaEncadeada();  
        Principal principal = new Principal();  

        principal.adicionarPessoa(listaEncadeada);  
        principal.remover(listaEncadeada);  

        while (listaEncadeada.temProximo()) {  
            System.out.println(listaEncadeada.getPosicaoAtual().getValor());  
        }  
    }  

    private void adicionarPessoa(ListaEncadeada listaEncadeada) {  
        listaEncadeada.adicionar(new Pessoa(1, "Joao", "jp@gmail.com"));  
        listaEncadeada.adicionar(new Pessoa(2, "Maria", "maria@gmail.com"));  
        listaEncadeada.adicionar(new Pessoa(3, "Bruno", "bruno@gmail.com"));  
        listaEncadeada.adicionar(new Pessoa(4, "Jose", "jose@gmail.com"));  
        listaEncadeada.adicionar(new Pessoa(5, "Mario", "mario@gmail.com"));  
        listaEncadeada.adicionar(new Pessoa(6, "Eduardo", "dudu@gmail.com"));  
    }  

    private void remover(ListaEncadeada listaEncadeada) {  
        listaEncadeada.remover();  
        listaEncadeada.remover();  
        listaEncadeada.remover();  
    }  
}