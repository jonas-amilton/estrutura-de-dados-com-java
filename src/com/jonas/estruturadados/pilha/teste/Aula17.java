package com.jonas.estruturadados.pilha.teste;

import com.jonas.estruturadados.pilha.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i = 1; i <= 10; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);

        pilha.desempilha();

        System.out.println(pilha);
    }
}
