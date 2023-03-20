package com.teste.java;
import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();
//fib1 e fib2 define os primeiros números da sequencia e no while continua verificando
        int fib1 = 0;
        int fib2 = 1;
        int fib_atual = 0;

        while (fib_atual < num) {
            fib_atual = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_atual;
        }

        if (fib_atual == num) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }    }
}
