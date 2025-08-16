/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila2;

/**
 *
 * @author jp
 */
public class Main {
       public static void main(String[] args) {

        Fila fila = new Fila();
        
        System.out.println("Enfileirando elementos...");
        fila.enfileira("Elemento 1");
        fila.enfileira("Elemento 2");
        fila.enfileira("Elemento 3");
       
        
        System.out.println("Primeiro elemento: " + fila.primeiro());
        System.out.println("Ultimo elemento: " + fila.ultimo());
        
        System.out.println("Tamanho da fila: " + fila.tamanho());
        
        System.out.println("\nDesenfileirando um elemento...");
        fila.desenfileira();
        
        System.out.println("Primeiro elemento: " + fila.primeiro());
        System.out.println("Tamanho da fila apos desenfileirar: " + fila.tamanho());
        
        System.out.println("\nEnfileirando mais elementos...");
        fila.enfileira("Elemento 4");
        fila.enfileira("Elemento 5");
        
        System.out.println("\nPrimeiro elemento: " + fila.primeiro());
        System.out.println("Ultimo elemento: " + fila.ultimo());
        System.out.println("Tamanho da fila: " + fila.tamanho());
        
        System.out.println("\nA fila esta vazia? " + fila.vazia());
    }
}