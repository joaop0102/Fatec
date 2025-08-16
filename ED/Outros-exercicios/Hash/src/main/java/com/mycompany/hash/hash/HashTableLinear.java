package com.mycompany.hash.hash;

import java.util.Scanner;

public class HashTableLinear {
    public static void main(String[] args) {
        HashLinear tab = new HashLinear(7);
        Scanner le = new Scanner(System.in);
        double item;
        int opcao = -1;

        do {
            System.out.println("\n================== MENU ==================");
            System.out.println("1 - Inserir elemento");
            System.out.println("2 - Buscar elemento");
            System.out.println("3 - Remover elemento");
            System.out.println("4 - Imprimir tabela");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String entrada = le.nextLine();

            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor real a inserir: ");
                    try {
                        item = Double.parseDouble(le.nextLine().replace(',', '.'));
                        tab.insere(item);
                    } catch (NumberFormatException e) {
                        System.out.println("-> Entrada inválida. Digite um número real.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor a buscar: ");
                    try {
                        item = Double.parseDouble(le.nextLine().replace(',', '.'));
                        int pos = tab.busca(item);
                        if (pos != -1)
                            System.out.println("-> Item encontrado na posição: " + pos);
                        else
                            System.out.println("-> Item não encontrado");
                    } catch (NumberFormatException e) {
                        System.out.println("-> Entrada inválida. Digite um número real.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor a remover: ");
                    try {
                        item = Double.parseDouble(le.nextLine().replace(',', '.'));
                        tab.apaga(item);
                    } catch (NumberFormatException e) {
                        System.out.println("-> Entrada inválida. Digite um número real.");
                    }
                    break;

                case 4:
                    System.out.println("Conteúdo da Tabela Hash:");
                    tab.imprime();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("-> Opção inválida. Digite um número entre 0 e 4.");
            }
        } while (opcao != 0);

        le.close();
    }
}