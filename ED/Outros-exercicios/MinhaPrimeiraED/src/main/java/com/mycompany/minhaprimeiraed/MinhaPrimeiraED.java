package com.mycompany.minhaprimeiraed;

/**
 * Classe que simula uma estrutura de dados simples.
 */
public class MinhaPrimeiraED {

    private Object[] objetos = new Object[10];  
    public int totalDeObjetos = 0;  

    public void adiciona(int posicao, Object objeto) {
        if (posicaoValida(posicao) && !posicaoOcupada(posicao)) {
            for (int i = totalDeObjetos; i > posicao; i--) {
                objetos[i] = objetos[i - 1];  
            }
            objetos[posicao] = objeto;  
            totalDeObjetos++;
        }
    }

    public void adiciona(Object objeto) {
        if (totalDeObjetos == objetos.length) {
            Object[] novoVetor = new Object[objetos.length * 2];

            for (int i = 0; i < objetos.length; i++) {
                novoVetor[i] = objetos[i];
            }
            objetos = novoVetor;
        }

        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] == null) {
                objetos[i] = objeto;
                totalDeObjetos++;
                break;
            }
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return objetos[posicao] != null;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < objetos.length;
    }

    public void remove(int posicao) {
        if (posicaoValida(posicao) && posicaoOcupada(posicao)) {
            for (int i = posicao; i < totalDeObjetos - 1; i++) {
                objetos[i] = objetos[i + 1];  
            }
            objetos[totalDeObjetos - 1] = null;  
            totalDeObjetos--;
        }
    }

    public String contem(Object objeto) {
        String mensagemContem = "Contem este objeto";
        String mensagemNaoContem = "Este objeto ja foi removido";
        for (int i = 0; i < totalDeObjetos; i++) {
            if (objetos[i].equals(objeto)) {
                return mensagemContem;
            }
        }
        return mensagemNaoContem;
    }

    public Object getObjeto(int posicao) {
        if (posicaoValida(posicao) && posicaoOcupada(posicao)) {
            return objetos[posicao];
        }
        return null;  
    }

    public int tamanho() {
        return totalDeObjetos;
    }
}
