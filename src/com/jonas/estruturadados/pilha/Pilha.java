package com.jonas.estruturadados.pilha;

import com.jonas.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[tamanho - 1];
    }

    public T desempilha() {
        if (this.estaVazia()) {
            return null;
        }

        // return this.elementos[--tamanho];

        T elemento = this.elementos[tamanho - 1];
        tamanho--;

        return elemento;
    }
}
