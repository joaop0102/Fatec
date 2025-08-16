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

    public void push(char e) {
        if (!estaCheia()) {
            topo++;
            p[topo] = e;
            qtdeElementos++;
        }
    }

    public char pop() {
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
}
