/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca2.modelo;

import br.com.senac.biblioteca2.modelo.Biblioteca2;
import br.com.senac.biblioteca2.modelo.Livro;

/**
 *
 * @author Daniel
 */
public class Dados {
    public Biblioteca2 biblioteca;
    
    public Dados() {
        initDados();
    }
    
    public void initDados(){
        this.biblioteca = new Biblioteca2("Biblioteca Estadual");
        this.biblioteca.addLivro(new Livro("Guerra e Paz","Liev Tolstói","Romance"));
        this.biblioteca.addLivro(new Livro("1889","Laurentino Gomes","História brasileira"));
        this.biblioteca.addLivro(new Livro("O Silmarillion","J.R.R. Tolkien","Fantasia"));
        this.biblioteca.addLivro(new Livro("Crime e Castigo","Fiódor Dostoiévski","Romance"));
        this.biblioteca.addLivro(new Livro("Fausto","J.W. Goethe","Poesia"));
    }
    
    public Biblioteca2 getBiblioteca(){
        return this.biblioteca;
    }
}
