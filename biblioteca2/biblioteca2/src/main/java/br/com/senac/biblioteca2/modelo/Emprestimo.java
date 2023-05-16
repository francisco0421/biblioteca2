/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca2.modelo;

import static br.com.senac.biblioteca2.modelo.Livro.livros;
import java.util.ArrayList;

/**
 *
 * @author Aluno TDS
 */
public class Emprestimo {
    public String id;
    public String titulo;
    public String autor;
    public String categoria;
    final static ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    
    public Emprestimo(String id, String titulo, String autor, String categoria){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }
    
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public static void cadastrar(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
   
    public static ArrayList<Emprestimo> getEmprestimo() {
        return emprestimos;
    }
}
