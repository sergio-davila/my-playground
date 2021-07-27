package com.example.myplayground.AA;

public class TenQuiz2 {
    public static void main(String[] args) {
        try{
            throw 0/5;
        } catch (ArithmeticException e) {
            throw new Exception();
            System.out.println("Caught");
        }
    }
}
