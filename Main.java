package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        if (args.length < 2) {
            System.out.println("Por favor, insira dois números inteiros:");
            System.out.print("Número 1: ");
            int inicio = scanner.nextInt();
            System.out.print("Número 2: ");
            int fim = scanner.nextInt();

            try {
                Contador contador = new Contador();
                contador.contar(inicio, fim);
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                int inicio = Integer.parseInt(args[0]);
                int fim = Integer.parseInt(args[1]);

                Contador contador = new Contador();
                contador.contar(inicio, fim);
            } catch (NumberFormatException e) {
                System.out.println("Os parâmetros devem ser números inteiros.");
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}


