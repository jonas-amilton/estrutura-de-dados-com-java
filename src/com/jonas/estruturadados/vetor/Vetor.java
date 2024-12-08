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
