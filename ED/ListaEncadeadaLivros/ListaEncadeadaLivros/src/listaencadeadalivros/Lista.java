package listaencadeadalivros;

public class Lista {
    private Livro cabeca;

    // Construtor
    public Lista() {
        this.cabeca = null; // Inicialmente a lista está vazia
    }

    public void adiciona(Livro livro) {
        if (cabeca == null) {
            cabeca = livro; 
        } else {
            Livro temp = cabeca;
            while (temp.getAnterior() != null) {
                temp = temp.getAnterior();
            }
            temp.setAnterior(livro); 
        }
    }

    public void remove() {
        if (cabeca != null) {
            cabeca = cabeca.getAnterior(); 
        }
    }

    public Livro getCabeca() {
        return cabeca;
    }

    public void listarLivros() {
        Livro temp = cabeca;
        while (temp != null) {
            System.out.println("Nome: " + temp.getNome() + ", Ano: " + temp.getAno() + ", Preço: " + temp.getPreco());
            temp = temp.getAnterior(); 
        }
    }
}