package com.jonas.estruturadados.pilha.labs;

import com.jonas.estruturadados.pilha.Pilha;

public class Exer05 {
    public static void main(String[] args) {

        String palavra = "ADA";
        String nome = "Jonas";

        imprimeResultado(palavra);
        imprimeResultado(nome);

    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palíndromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {

        // palavra original ADA

        // empilhar palavra ADA
        // [A]
        // [D]
        // [A]

        // nova string após desempilhar ADA

        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";

        while (!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }
}
