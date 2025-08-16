import java.util.Scanner;
 
public class Fase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
 
        int[] pontuacoes = new int[N];
        for (int i = 0; i < N; i++) {
            pontuacoes[i] = sc.nextInt();
        }
 
        for (int i = 1; i < N; i++) {
            int chave = pontuacoes[i];
            int j = i - 1;
 
            while (j >= 0 && pontuacoes[j] < chave) {
                pontuacoes[j + 1] = pontuacoes[j];
                j--;
            }
            pontuacoes[j + 1] = chave;
        }
 
        int corte = pontuacoes[K - 1];
 
        int classificados = 0;
        for (int p : pontuacoes) {
            if (p >= corte) {
                classificados++;
            }
        }
 
        System.out.println(classificados);
        sc.close();
    }
}