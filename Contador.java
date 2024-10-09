package com.example;

public class Contador {

    public void contar(int inicio, int fim) throws ParametrosInvalidosException {

        if (inicio > fim) {
            throw new ParametrosInvalidosException("O parâmetro inicial não pode ser maior que o final.");
        }

        int iteracoes = 0; // Variável para contar as iterações
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
            iteracoes++;
        }

        System.out.println("Número de iterações realizadas: " + iteracoes);
    }
}

