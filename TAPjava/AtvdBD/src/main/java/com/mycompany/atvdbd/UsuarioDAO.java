package com.mycompany.atvdbd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }

    // INSERT
    public void inserir(String nome, String email, int idade) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, email, idade) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setInt(3, idade);
            stmt.executeUpdate();
        }
    }

    // SELECT ALL
    public List<Usuario> listarTodos() throws SQLException {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Usuario(
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getInt("idade")
                ));
            }
        }
        return lista;
    }

    // SELECT por email
    public Usuario buscarPorEmail(String email) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getInt("idade")
                    );
                }
            }
        }
        return null;
    }

    // UPDATE
    public void atualizarIdade(String email, int novaIdade) throws SQLException {
        String sql = "UPDATE usuarios SET idade = ? WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, novaIdade);
            stmt.setString(2, email);
            stmt.executeUpdate();
        }
    }

    // DELETE
    public void excluirPorEmail(String email) throws SQLException {
        String sql = "DELETE FROM usuarios WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.executeUpdate();
        }
    }
}
