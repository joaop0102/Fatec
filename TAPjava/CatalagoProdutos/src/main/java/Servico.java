/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jp
 */
public class Servico implements ItemVenda, Importante{
    private String descricao;
    private double valorHora;
    private int horas;
    
    public Servico(String descricao, double valorHora, int horas){
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.horas = horas;
    }
    
    @Override
    public double getPreco(){
    return valorHora * horas;
    }
    
    @Override
    public String getDescricao(){
    return "Serviço : " + descricao + " - Total: R$" + getPreco();
    }
}
