package com.jonas.estruturadados.pilha.labs;

import java.util.Scanner;

import com.jonas.estruturadados.pilha.Pilha;

public class Exer02 {
    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.println("Entre com um número: ");

            int num = scan.nextInt();

            if (num == 0) {

                // pilha par
                Integer desempilhado = par.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par está vazia.");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }

                // pilha impar
                desempilhado = impar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha impar está vazia.");
                } else {
                    System.out.println("Desempilhando da pilha impar: " + desempilhado);
                }

            } else if (num % 2 == 0) {
                System.out.println("Empilhando na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Empilhando na pilha impar: " + num);
                impar.empilha(num);
            }
        }

        System.out.println("Desempilhando todos os números da pilha par.");

        while (!par.estaVazia()) {
            System.out.println("Desempilhando da pilha par: " + par.desempilha());
        }

        System.out.println("Desempilhando todos os números da pilha impar.");

        while (!impar.estaVazia()) {
            System.out.println("Desempilhando da pilha impar: " + impar.desempilha());
        }
    }
}
