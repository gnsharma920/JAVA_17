package com.java.supplier;

import java.util.function.Supplier;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Supplier<String> supplier= ()->{
            String randomNumber="";
            for(int i=0;i<4;i++){
                String temp= String.valueOf ((int) (Math.random()*10));
                randomNumber+=temp;
            }
            return randomNumber;
        };

        for(int i=1;i<=10;i++){
            System.out.println("******************************");
            System.out.println("OTP: "+supplier.get());
        }
    }
}
