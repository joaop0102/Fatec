/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinamento;

import javax.swing.JOptionPane;

/**
 *
 * @author jp
 */
public class Lista {
     No primeiro, ultimo;  
    int totalNos;  

    public Lista() {  
        primeiro = ultimo = null;  
        totalNos = 0;  
    }  

    public int getTotalNos() {  
        return totalNos;  
    }  

    public boolean checkIfListaVazia() {  
        return getTotalNos() == 0;  
    }  

    public void inserirNoInicio(No n) {  
        if (checkIfListaVazia()) {  
            primeiro = ultimo = n;  
        } else {  
            n.prox = primeiro;  
            primeiro = n;  
        }  
        totalNos++;  
    }  

    public void inserirNoFim(No n) {  
        if (checkIfListaVazia()) {  
            primeiro = ultimo = n;  
        } else {  
            ultimo.prox = n;  
            ultimo = n;  
        }  
        totalNos++;  
    }  

    public void excluirNo(No n) {  
        No noAtual, noAnterior;  
        noAtual = noAnterior = primeiro;  
        int contador = 1;  

        if (!checkIfListaVazia()) {  
            while (contador <= getTotalNos() && noAtual.valor != n.valor) {  
                noAnterior = noAtual;  
                noAtual = noAtual.prox;  
                contador++;  
            }  

            if (noAtual.valor == n.valor) {  
                if (getTotalNos() == 1) {  
                    primeiro = ultimo = null;  
                } else {  
                    if (noAtual == primeiro) {  
                        primeiro = noAtual.prox;  
                    } else {  
                        noAnterior.prox = noAtual.prox;  
                    }  
                }  
                totalNos--;  
            }  
        }  
    }  

    public void exibirLista() {  
        No temp = primeiro;  
        String valores = "";  
        int contador = 1;  

        if (!checkIfListaVazia()) {  
            while (contador <= getTotalNos()) {  
                valores += Integer.toString(temp.valor) + "-";  
                temp = temp.prox;  
                contador++;  
            }  
        }  
        JOptionPane.showMessageDialog(null, valores);  
    }  
}