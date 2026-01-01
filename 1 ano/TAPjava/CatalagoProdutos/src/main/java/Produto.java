/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jp
 */
public class Produto implements Promocional, Comparable<Produto>, Importante{
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
    }
    
    @Override
    public double getPreco() {
    return preco;
    }
    
    @Override
    public String getDescricao(){
    return "Produto: " + nome + " - R$" + preco;
    }
    
    @Override
    public double aplicarDesconto(double percentual){
    if(percentual > 0 && percentual <= 100){
    preco -= preco * (percentual / 100);
    }
    return preco;
    }
    
    @Override
    public int compareTo(Produto outro){
    return Double.compare(this.preco, outro.preco);
    }
}
