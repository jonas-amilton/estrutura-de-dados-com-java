package com.jonas.estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {

        Queue<Integer> filaComPrioridade = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                });

        filaComPrioridade.add(2);
        filaComPrioridade.add(1);
        filaComPrioridade.add(3);

        System.out.println(filaComPrioridade);

    }
}
