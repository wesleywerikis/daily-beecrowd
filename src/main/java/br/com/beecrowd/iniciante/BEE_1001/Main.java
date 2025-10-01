package br.com.beecrowd.iniciante.BEE_1001;

import java.util.Scanner;

/**
 * Beecrowd | 1001
 * Extremamente Básico
 *
 * 📌 Enunciado:
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B.
 * Efetue a soma de A e B atribuindo o seu resultado na variável X.
 * Imprima X conforme o formato especificado.
 *
 * Entrada:
 * - Dois valores inteiros.
 *
 * Saída:
 * - A mensagem "X = " seguida pelo valor da soma e uma quebra de linha.
 * - Cuide para que haja um espaço antes e depois do sinal de igual.
 *
 * 💡 Raciocínio:
 * 1. Ler dois inteiros (A e B).
 * 2. Somar e armazenar em X.
 * 3. Imprimir no formato exato: "X = <valor>".
 *
 * Exemplo:
 * Entrada:
 * 10
 * 9
 *
 * Saída:
 * X = 19
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = A + B;

        System.out.println("X = " + X);

        scanner.close();
    }
}
