package com.jonas.estruturadados.vetor;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // Método eficiente utilizando boolean
    public boolean adiciona(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }
        return false;
    }

    public void limpar() {
        // opção 1:
        // this.elementos = (T[]) new Object[this.elementos.length];

        // opção 2:
        // this.tamanho = 0;

        // opção 3:
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        return this.elementos[posicao];
    }

    // algoritmo de busca sequencial
    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {

        /**
         * primeira solução:
         * 
         * return busca(elemento) > -1;
         */

        /**
         * segunda solução:
         * 
         * int pos = busca(elemento);
         * 
         * if(pos > -1) {
         * return true;
         * } else {
         * return false;
         * }
         */

        return busca(elemento) > -1;
    }

    public int ultimoIndice(T elemento) {

        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public void remove(int posicao) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    public void remove(T elemento) {
        int pos = this.busca(elemento);

        if (pos > -1) {
            this.remove(pos);
        }
    }

    // algoritmo de inserção
    public boolean adiciona(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.elementos[i]);
            sb.append(", ");
        }

        if (this.tamanho > 0) {
            sb.append(this.elementos[this.tamanho - 1]);
        }

        sb.append("]");

        return sb.toString();
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
}
