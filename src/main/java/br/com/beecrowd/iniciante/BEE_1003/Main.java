package br.com.beecrowd.iniciante.BEE_1003;

import java.util.Scanner;

/**
 * Beecrowd | 1003
 * Soma Simples
 *
 * 📌 Enunciado:
 * Leia dois valores inteiros e calcule a soma. Guarde o resultado em SOMA.
 *
 * Entrada:
 * - Dois inteiros.
 *
 * Saída:
 * - "SOMA = <resultado>" seguido de quebra de linha.
 *
 * Exemplo:
 * Entrada:
 * 30
 * 10
 * Saída:
 * SOMA = 40
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
}
