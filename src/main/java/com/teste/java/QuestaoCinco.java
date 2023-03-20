package com.teste.java;
import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        // Lendo a string do usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palava: ");
        String original = sc.nextLine();
        //sc.close();

        // Convertendo a string para um array de caracteres
        char[] caracteres = original.toCharArray();

        // Invertendo os caracteres
        int inicio = 0;
        int fim = caracteres.length - 1;
        while (fim > inicio) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            fim--;
            inicio++;
        }

        // Convertendo o array de caracteres de volta para a string
        String invertida = new String(caracteres);

        // Imprimindo a string invertida
        System.out.println("String invertida: " + invertida);
    }
}
