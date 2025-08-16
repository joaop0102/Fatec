/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sort;

/**
 *
 * @author jp
 */
public class HeapSort {

    public static void sort(int[] vetor) {
        int tamanho = vetor.length;
        int i = tamanho / 2, pai, filho, t;
        while (true) {
            if (i > 0) {
                i--; t = vetor[i];
            } else {
                tamanho--;
                if (tamanho <= 0) { return; }
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }

            pai = i;
            filho = ((i * 2) + 1);

            while (filho < tamanho) {
                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) {
                    filho++;
                }
                if (vetor[filho] > t) {
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                } else {
                    break;
                }
            }
            vetor[pai] = t;
        }
    }

    public static void main(String[] args) {
        int[] vetor = {4, 10, 3, 5, 1};
        System.out.println("Antes da ordenação:");
        for (int num : vetor) System.out.print(num + " ");
        
        sort(vetor);

        System.out.println("\nDepois da ordenação:");
        for (int num : vetor) System.out.print(num + " ");
    }
}