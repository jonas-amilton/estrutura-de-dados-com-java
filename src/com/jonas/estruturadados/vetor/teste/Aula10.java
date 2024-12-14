package com.jonas.estruturadados.vetor.teste;

import com.jonas.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Jonas", "9999-9999", "jonas@email.com.");
        Contato c2 = new Contato("Maria", "8888-8888", "maria@email.com.");
        Contato c3 = new Contato("João", "7777-7777", "joao@email.com.");

        // Contato c4 = new Contato("Mario", "6666-6666", "mario@email.com.");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        System.out.println(vetor);

        int pos = vetor.busca(c2);
        // int pos = vetor.busca(c4);

        if (pos > -1) {
            System.out.println("Elemento encontrado na posição " + pos);
        } else {
            System.out.println("Elemento não encontrado");
        }

    }
}
