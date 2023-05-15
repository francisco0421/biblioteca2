/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca2.modelo;

/**
 *
 * @author Daniel
 */
public class Livro {
    public int id;
    public String titulo;
    public String autor;
    public String categoria;
    public boolean disponivel;
    
    public Livro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponivel = true;
    }
    
    public Livro(int id){
        this.id = id;
    }

    public int getId() {
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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
