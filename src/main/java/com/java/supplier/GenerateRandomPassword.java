package com.java.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class GenerateRandomPassword {
    public static String generatePassword() {
        String symbol = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$%0123456789";
        Supplier<Integer> supplierNumber = () -> (int) (Math.random() * 10);
        Supplier<Character> supplierChar = () -> symbol.charAt(new Random().nextInt(0, 66));

        String password = "";
        while (password.length() < 11) {
            password += supplierChar.get();
        }
        return password;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("***********************************");
            System.out.println("Password: " + generatePassword());
        }
    }
}
