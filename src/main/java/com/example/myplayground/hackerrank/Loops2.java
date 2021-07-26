package com.example.myplayground.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loops2 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (n % 2 != 0 || (n % 2 == 0 && n >= 6 && n <= 20)) {
            System.out.print("Weird");
        } else {
            System.out.print("Not Weird");
        };
    }
}