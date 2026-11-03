package com.example;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;

        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        } else {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }
}
