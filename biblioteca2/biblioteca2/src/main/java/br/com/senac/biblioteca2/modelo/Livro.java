/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca2.modelo;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Livro {
    public String id;
    public String titulo;
    public String autor;
    public String categoria;
     final static ArrayList<Livro> livros = new ArrayList<>();
    
    public Livro(String id, String titulo, String autor, String categoria) {
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
    
    public static void removeLivro(Livro livro){
        livros.remove(livro);
    }
    
    public static void removeLivro1(int livro){
        livros.remove(livro);
    }

    public static ArrayList<Livro> getLivros() {
        return livros;
    }
    
   

}
