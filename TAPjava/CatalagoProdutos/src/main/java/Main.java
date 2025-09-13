/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jp
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Livro Java", 120.00);
        Produto p3 = new Produto("Smartphone", 2200.00);

        p2.aplicarDesconto(10);

        Servico s1 = new Servico("Manutenção de Computador", 100.00, 2);
        Servico s2 = new Servico("Consultoria em TI", 150.00, 3);

        List<ItemVenda> itens = new ArrayList<>();
        itens.add(p1);
        itens.add(p2);
        itens.add(p3);
        itens.add(s1);
        itens.add(s2);

        System.out.println("=== Catálogo de Produtos e Serviços ===");
        for (ItemVenda item : itens) {
            System.out.println(item.getDescricao());
        }
        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        Collections.sort(produtos);

        System.out.println("\n=== Produtos Ordenados por Preço ===");
        for (Produto p : produtos) {
            System.out.println(p.getDescricao());
        }

        System.out.println("\n=== Itens Importantes ===");
        for (ItemVenda item : itens) {
            if (item instanceof Importante) {
                System.out.println(item.getDescricao());
            }
        }
    }
}
