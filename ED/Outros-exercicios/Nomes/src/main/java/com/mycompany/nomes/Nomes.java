package com.mycompany.nomes;

/**
 *
 * @author jp
 */
public class Nomes {

    private String[] nomes = new String[26]; 
    public int total_nomes = 0;

    public int getIndice(String nome) {
        if (nome == null || nome.isEmpty()) {
            return -1; 
        }
        char letraInicial = nome.toUpperCase().charAt(0); 
        return letraInicial - 'A';
    }

    public void adiciona(String nome) {
        int posicao = getIndice(nome); 

        if (posicao < 0 || posicao >= 26 || posicaoOcupada(posicao)) {
            System.out.println("Nao foi possivel adicionar o nome '" + nome + "' na posicao correspondente.");
            return;
        }

        nomes[posicao] = nome;
        total_nomes++; 
        System.out.println("Nome '" + nome + "' adicionado com sucesso!");
    }

    private boolean posicaoOcupada(int posicao) {
        return nomes[posicao] != null; 
    }

    public void remove(String nome) {
        int posicao = getIndice(nome);

        if (posicao >= 0 && posicao < 26 && nomes[posicao] != null && nomes[posicao].equals(nome)) {
            nomes[posicao] = null;
            total_nomes--; 
            System.out.println("Nome '" + nome + "' removido com sucesso!");
        } else {
            System.out.println("Nome '" + nome + "' nao encontrado.");
        }
    }

    public boolean contem(String nome) {
        int posicao = getIndice(nome);
        return posicao >= 0 && posicao < 26 && nomes[posicao] != null && nomes[posicao].equals(nome);
    }

    public String getNome(int posicao) {
        if (posicao < 0 || posicao >= 26) {
            return "Posição inválida.";
        }
        return nomes[posicao] != null ? nomes[posicao] : "Nenhum nome registrado nesta posicao."; 
    }

    public boolean validaNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    public int totalNomes() {
        return total_nomes;
    }
}
