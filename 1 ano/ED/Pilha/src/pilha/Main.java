package pilha;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(50); 

        // Receber a palavra do usuário
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para verificar se é um palíndromo:");

        // Remover espaços e transformar para minúsculas
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        // Verificar se a palavra é um palíndromo
        if (pilha.verificarPalindromo(palavra)) {
            JOptionPane.showMessageDialog(null, "A palavra é um palíndromo!");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra não é um palíndromo.");
        }
    }
}

