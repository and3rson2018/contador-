package com.example;

public class ContadorDeNumerosInteiros {

        public void contar(int inicio, int fim) throws ParametrosInvalidosException {

            if (inicio > fim) {
                throw new ParametrosInvalidosException("O parâmetro inicial não pode ser maior que o final.");
            }

            int iteracoes = 0;
            for (int i = inicio; i <= fim; i++) {
                System.out.println(i);
                iteracoes++;
            }

            System.out.println("Número de iterações realizadas: " + iteracoes);
        }
    }
