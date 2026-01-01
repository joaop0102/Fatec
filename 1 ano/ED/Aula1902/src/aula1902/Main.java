/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1902;

/**
 *
 * @author FATEC ZONA LESTE
 */
package com.mycompany.minhaprimeiraed;

public class Main {
    public static void main(String[] args) {
        MinhaPrimeiraED ed = new MinhaPrimeiraED();
        
        ed.adiciona("Objeto 1");
        ed.adiciona("Objeto 2");
        ed.adiciona("Objeto 3");
        ed.adiciona("Objeto 4"); 
        ed.adiciona("Objeto 5"); 
        
        System.out.println("Tamanho: " + ed.tamanho());  
        ed.remove(1);
        System.out.println("Tamanho apos remocao: " + ed.tamanho());  
        System.out.println("Objeto na posicao 1: " + ed.getObjeto(1));        
        System.out.println("Objeto existente? " + ed.contem("Objeto 2"));  
    }
}