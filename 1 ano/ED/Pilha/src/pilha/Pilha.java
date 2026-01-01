package pilha;

import javax.swing.JOptionPane;

public class Pilha {
    int topo = -1;
    int tamanho;
    char p[];
    int qtdeElementos = 0;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        p = new char[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia() {
        return qtdeElementos == 0;
    }

    public boolean estaCheia() {
        return qtdeElementos == tamanho;
    }

    public void empilha(char e) {
        if (!estaCheia()) {
            topo++;
            p[topo] = e;
            qtdeElementos++;
        }
    }

    public char desempilha() {
        char x = '\0';
        if (!estaVazia()) {
            x = p[topo];
            topo--;
            qtdeElementos--;
        }
        return x;
    }

    public void mostrar() {
        String elementos = "";
        for (int i = topo; i >= 0; i--) {
            elementos += p[i] + " | ";
        }
        JOptionPane.showMessageDialog(null, elementos);
    }
    
    // verificqação se a palavra é um palindromo
    public boolean verificarPalindromo(String palavra) {
        Pilha pilhaPrincipal = new Pilha(palavra.length());

        // empilhamento das letras da palavra na pilha principal
        for (int i = 0; i < palavra.length(); i++) {
            pilhaPrincipal.empilha(palavra.charAt(i));
        }

        // compaação da palavra original com os caracteres desempilhados
        boolean isPalindromo = true;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != pilhaPrincipal.desempilha()) {
                isPalindromo = false;
                break;
            }
        }

        return isPalindromo;
    }
}
