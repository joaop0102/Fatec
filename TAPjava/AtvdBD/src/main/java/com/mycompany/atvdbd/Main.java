package com.mycompany.atvdbd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jp
 */
import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/bd?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String user = "root";
            String password = ""; 
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso!");
            UsuarioDAO dao = new UsuarioDAO(conn);

            // Inserir
            dao.inserir("Maria", "maria@email.com", 25);
            dao.inserir("Pedro", "pedro@email.com", 30);
            dao.inserir("Ana", "ana@email.com", 22);

            // Listar todos
            System.out.println("=== LISTAR TODOS ===");
            List<Usuario> lista = dao.listarTodos();
            lista.forEach(System.out::println);

            // Buscar por email
            System.out.println("\n=== BUSCAR POR EMAIL ===");
            Usuario u = dao.buscarPorEmail("ana@email.com");
            System.out.println(u);

            // Atualizar idade
            System.out.println("\n=== ATUALIZAR IDADE ===");
            System.out.println("Antes: " + dao.buscarPorEmail("pedro@email.com"));
            dao.atualizarIdade("pedro@email.com", 35);
            System.out.println("Depois: " + dao.buscarPorEmail("pedro@email.com"));

            // Excluir
            System.out.println("\n=== EXCLUIR ===");
            dao.excluirPorEmail("maria@email.com");
            dao.listarTodos().forEach(System.out::println);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
