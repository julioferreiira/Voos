package br.com.fescfafic.voo.Model;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    public String nome;
    public int id;
    public String email;
    ;

    public Passageiro(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;

    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("E-mail: " + email);
    }
}