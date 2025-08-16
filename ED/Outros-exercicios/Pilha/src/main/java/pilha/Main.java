package pilha;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Receber a palavra do usuário
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para verificar se é um palíndromo:");

        // Remover espaços e transformar para minúsculas
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        int tamanho = palavra.length();
        Pilha pilha1 = new Pilha(tamanho);
        Pilha pilha_aux = new Pilha(tamanho);
        Pilha pilha2 = new Pilha(tamanho);

        // Empilhar a palavra original na pilha1
        for (int i = 0; i < palavra.length(); i++) {
            pilha1.push(palavra.charAt(i));
        }

        // Usar pilha_aux para inverter a ordem e armazenar na pilha2
        while (!pilha1.estaVazia()) {
            pilha_aux.push(pilha1.pop());
        }

        while (!pilha_aux.estaVazia()) {
            pilha2.push(pilha_aux.pop());
        }

        // Verificar se é palíndromo comparando caracteres de pilha1 (original) e pilha2 (invertida)
        boolean isPalindromo = true;
        for (int i = 0; i < palavra.length(); i++) {
            char original = palavra.charAt(i);
            char invertido = pilha2.pop();

            if (original != invertido) {
                isPalindromo = false;
                break;
            }
        }

        if (isPalindromo) {
            JOptionPane.showMessageDialog(null, "A palavra é um palíndromo!");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra não é um palíndromo.");
        }
    }
}
