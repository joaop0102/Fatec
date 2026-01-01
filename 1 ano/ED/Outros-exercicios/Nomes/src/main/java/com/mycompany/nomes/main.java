package com.mycompany.nomes;

/**
 *
 * @author jp
 */
public class main {
    public static void main(String[] args) {
        Nomes nm = new Nomes();

        nm.adiciona("Ana");
        nm.adiciona("Bianca");
        nm.adiciona("Carlos");
        nm.adiciona("Daniel");
        nm.adiciona("Ednaldo");
        nm.adiciona("Fabiano");
        nm.adiciona("Guilherme");
        nm.adiciona("Ricardo");

        System.out.println("Total de nomes cadastrados: " + nm.totalNomes());

        System.out.println("O nome 'Carlos' esta na lista? " + (nm.contem("Carlos") ? "Sim" : "Nao"));

        nm.remove("Ricardo");

        System.out.println("Total de nomes apos remocao: " + nm.totalNomes());

        System.out.println("Nome na posicao 0: " + nm.getNome(0));

        nm.adiciona("Cesar");
    }
}
