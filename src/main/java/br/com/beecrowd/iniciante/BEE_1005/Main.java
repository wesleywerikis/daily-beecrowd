package br.com.beecrowd.iniciante.BEE_1005;

import java.util.Locale;
import java.util.Scanner;

/**
 * Beecrowd | 1005
 * Média 1
 *
 * 📌 Enunciado:
 * Leia 2 valores de ponto flutuante (double) A e B, representando as notas de um aluno.
 * Calcule a média ponderada com pesos 3.5 para A e 7.5 para B (soma dos pesos = 11).
 * Fórmula: MEDIA = (A*3.5 + B*7.5) / 11
 *
 * Entrada:
 * - Dois valores de ponto flutuante (double), cada um com uma casa decimal.
 *
 * Saída:
 * - "MEDIA = <valor>" com 5 casas decimais e quebra de linha.
 * - Deve haver um espaço antes e outro depois do sinal de igualdade.
 *
 * Exemplo:
 * Entrada:
 * 5.0
 * 7.1
 * Saída:
 * MEDIA = 6.43182
 *
 * Observações:
 * - Utilize variáveis do tipo double para evitar divisão inteira.
 * - Garanta ponto como separador decimal (ex.: Locale.US).
 * - Respeite exatamente a formatação do texto (maiúsculas, espaços e casas decimais).
 */

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double MEDIA = (A * 3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA = %.5f%n", MEDIA);
        
        scanner.close();
    }

}
