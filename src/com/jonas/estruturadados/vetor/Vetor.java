package com.jonas.estruturadados.vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /**
     * 
     * Método ineficiente, por que percorre toda a lista
     * para adicionar um novo elemento
     * 
     * public void adiciona(String elemento) {
     * for (int i = 0; i < elementos.length; i++) {
     * if (this.elementos[i] == null) {
     * this.elementos[i] = elemento;
     * break;
     * }
     * }
     * }
     */

    // Método eficiente utilizando exceções
    // public void adiciona(String elemento) throws Exception {
    // if (this.tamanho < this.elementos.length) {
    // this.elementos[this.tamanho] = elemento;
    // this.tamanho++;
    // } else {
    // throw new Exception("Vetor já está cheio, não é possível adicionar mais
    // elementos.");
    // }
    // }

    // Método eficiente utilizando boolean
    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    // public String busca(int posicao) {

    // if (!(posicao >= 0 && posicao < this.tamanho)) {
    // throw new IllegalArgumentException("Posição inválida.");
    // }
    // return this.elementos[posicao];
    // }

    // algoritmo de busca sequencial
    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    public boolean adiciona(int posicao, String elemento) {

        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

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

}
