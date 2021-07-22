package com.example.myplayground.hackerrank;

import java.util.Scanner;

public class nextLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = scan.nextInt();
        double d = scan.nextDouble();
        String o = scan.nextLine();
        String s = scan.nextLine();



        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}