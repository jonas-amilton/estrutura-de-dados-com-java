package com.jonas.estruturadados.pilha.labs;

import com.jonas.estruturadados.pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<Livro>(20);

        Livro livro1 = new Livro();
        livro1.setNome("O Poder do Hábito");
        livro1.setAutor("Charles Duhigg");
        livro1.setAnoLancamento(2016);
        livro1.setIsbn("kfoajfoajfoaj");

        Livro livro2 = new Livro();
        livro2.setNome("UML Metodologias e Ferramentas CASE");
        livro2.setAutor("Alberto Silva");
        livro2.setAnoLancamento(2018);
        livro2.setIsbn("kfoajfoajfoaj");

        Livro livro3 = new Livro();
        livro3.setNome("Engenharia de Software 7° Edição");
        livro3.setAutor("Roger S. Pressman");
        livro3.setAnoLancamento(2010);
        livro3.setIsbn("kfoajfoajfoaj");

        Livro livro4 = new Livro();
        livro4.setNome("Code Complete");
        livro4.setAutor("Steve McConnel");
        livro4.setAnoLancamento(2018);
        livro4.setIsbn("kfoajfoajfoaj");

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha...");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);

        System.out.println(pilha.tamanho() + " livros foram empilhados.");

        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());

        System.out.println("Espiando o topo da pilha: " + pilha.topo());

        System.out.println("Desempilhando livros da pilha...");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia? " + pilha.estaVazia());
    }
}
