package com.example.myplayground.AA;public class TenQuiz {

    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
           try {
               int i = 0 / 5;
               throw new ArithmeticException();
           } catch (ArithmeticException el) {
               System.out.println("Exception");
           }
            System.out.println("Caught");
        }
    }
}
