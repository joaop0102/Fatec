package com.mycompany.atvdbd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jp
 */
public class Usuario {
    private String nome;
    private String email;
    private int idade;
    
    public Usuario(String nome, String email, int idade){
    this.nome = nome;
    this.email = email;
    this.idade = idade;
    }
    @Override
    public String toString(){
    return nome + " - " + email + " anos";
    }
}
