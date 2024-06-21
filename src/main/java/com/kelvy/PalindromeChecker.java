package com.kelvy;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Remover espaços e pontuações e converter para minúsculas
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Verificar se a string é um palíndromo
        if (isPalindrome(cleanedInput)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
