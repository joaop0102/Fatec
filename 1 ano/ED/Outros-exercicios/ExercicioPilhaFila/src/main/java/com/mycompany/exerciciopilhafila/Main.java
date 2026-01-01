/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopilhafila;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jp
 */
public class Main {
    public static void main(String[] args){
        
        Queue<Fila> filaDePacotes = new ArrayDeque<>();
        
        int numeroPac = 10;
        Scanner scannerPacotes = new Scanner(System.in);
        
        for(int i = 0; i < numeroPac; i++){
            System.out.println("Qual a numeração do pacote de número:  " + i);
            int numeracaoRecebida = scannerPacotes.nextInt();
            
            Fila pacote = new Fila(numeracaoRecebida);
            
            if(pacote.getNumeracao() > 0 && pacote.getNumeracao() < 4){
            filaDePacotes.add(pacote);
            }
        }
        
        System.out.println("Pacote na fila: " + filaDePacotes.size());
        
        Stack<Fila> pilha1 = new Stack<>();
        Stack<Fila> pilha3 = new Stack<>();
        Stack<Fila> pilha2 = new Stack<>();
        
        while(!filaDePacotes.isEmpty()){
            Fila pacote = filaDePacotes.poll();
            
            if(pacote.getNumeracao() == 1){
                pilha1.push(pacote);
            }
            if(pacote.getNumeracao() == 2){
                pilha2.push(pacote);
            }
            if(pacote.getNumeracao() == 3){
                pilha3.push(pacote);
            }
            
        }
        System.out.println("Pilha 1");
        Impressora.imprimir(pilha1);
        
        System.out.println("Pilha 2");
        Impressora.imprimir(pilha2);
        
        System.out.println("Pilha 3");
        Impressora.imprimir(pilha3);
    }
}