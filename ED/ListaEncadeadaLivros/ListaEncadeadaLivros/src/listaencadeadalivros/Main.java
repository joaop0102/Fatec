package listaencadeadalivros;

public class Main {
    public static void main(String[] args) {
        // Criação de objetos Livro
        Livro livro1 = new Livro("O poder do hábito", 2012, 56.00);
        Livro livro2 = new Livro("A arte da guerra", 2019, 11.95);
        Livro livro3 = new Livro("Elon Musk", 2023, 69.51);

        Lista listaLivros = new Lista();

        System.out.println("Adicionando livros à lista...");
        listaLivros.adiciona(livro1);
        listaLivros.adiciona(livro2);
        listaLivros.adiciona(livro3);

        System.out.println("\nLivros na lista:");
        listaLivros.listarLivros();

        System.out.println("\nRemovendo o primeiro livro da lista...");
        listaLivros.remove();

        System.out.println("\nLivros na lista após remoção:");
        listaLivros.listarLivros();
    }
}
