package br.com.beecrowd.iniciante.BEE_1004;

import java.util.Scanner;

/**
 * Beecrowd | 1004
 * Produto Simples
 *
 * 📌 Enunciado:
 * Leia dois valores inteiros, calcule o produto e guarde em PROD.
 *
 * Entrada:
 * - Dois valores inteiros.
 *
 * Saída:
 * - "PROD = <resultado>" seguido de quebra de linha.
 *
 * Exemplo:
 * Entrada:
 * 3
 * 9
 * Saída:
 * PROD = 27
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int PROD = A * B;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
