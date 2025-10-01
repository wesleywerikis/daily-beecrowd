package br.com.beecrowd.iniciante.BEE_1002;

import java.util.Locale;
import java.util.Scanner;

/**
 * Beecrowd | 1002
 * Área do Círculo
 *
 * 📌 Enunciado (resumo):
 * Leia um valor de raio (double). Considere π = 3.14159.
 * Calcule a área da circunferência: area = π * raio^2.
 *
 * Entrada:
 * - Um valor de ponto flutuante (double) representando o raio.
 *
 * Saída:
 * - Imprimir "A=" seguido da área com 4 casas decimais e quebra de linha.
 * - Ex.: A=12.5664
 *
 * 💡 Notas:
 * - Use exatamente π = 3.14159 (não Math.PI).
 * - Formate com 4 casas decimais.
 * - Garanta separador decimal com ponto (Locale.US).
 */

public class Main {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double PI = 3.14159;
        double area = PI * R * R;

        System.out.printf("A=%.4f%n", area);
        
        scanner.close();
    }
}
