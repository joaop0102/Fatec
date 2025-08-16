package listaencadeadalivros;

public class Livro {
    private String nome;
    private int ano;
    private double preco;
    private Livro anterior;

    // Construtor
    public Livro(String nome, int ano, double preco) {
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
        this.anterior = null; 
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public Livro getAnterior() {
        return anterior;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    }
}
