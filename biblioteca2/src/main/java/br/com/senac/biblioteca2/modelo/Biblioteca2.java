/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.biblioteca2.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno TDS
 */
public class Biblioteca2 extends javax.swing.JFrame{
    public String nome;
    public final List<Livro> livros;
    public int idCounter = 0;

    public Biblioteca2(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
    }
    
    public void addLivro(Livro livro){
        livro.setId(++this.idCounter);
        this.livros.add(livro);
    }
    
    public void removeLivro(Livro livro){
        this.livros.remove(livro);
    }
    
    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }
    
}
