package com.teste.java;

public class QuestaoQuatro {
    public static void main(String[] args) {
        double[] faturamento = { 67836.43, 36678.66, 29229.88, 27165.48, 19849.53 };
        String[] estados = { "SP", "RJ", "MG", "ES", "Outros" };

        double total = 0;
        for (double valor : faturamento) {
            total += valor;
        }

        for (int i = 0; i < faturamento.length; i++) {
            double porcentagem = (faturamento[i] / total) * 100;
            System.out.printf("%s: %.2f%%\n", estados[i], porcentagem);
        }
    }

}
