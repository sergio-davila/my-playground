package com.example.myplayground.hackerrank;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java {

    // java static initializer block
    static Scanner input = new Scanner(System.in);
    static boolean flag = true;
    static int B = input.nextInt();
    static int H = input.nextInt();
    private static java.util.Locale Locale;

    static{
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }

    public static String findDay(int month, int day, int year) {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int sum = 0;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == letter) {
                    sum++;
                }
                if (b.charAt(i) == letter) {
                    sum--;
                }
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // java output formatting
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

        // java end of file
        for(int i = 1; sc.hasNext()== true; i++){
            System.out.println(i + " " + sc.nextLine());
        }

        if(flag){
            int area=B*H;
            System.out.print(area);
        }

        // java intToString
//        try {
//            Scanner in = new Scanner(System.in);
//            int n = in .nextInt();
//            in.close();
//            //String s=???; Complete this line below
//            String s = Integer.toString(n);
//            //Write your code here
//
//
//            if (n == Integer.parseInt(s)) {
//                System.out.println("Good job");
//            } else {
//                System.out.println("Wrong answer.");
//            }
//        } catch (DoNotTerminate.ExitTrappedException e) {
//            System.out.println("Unsuccessful Termination!!");
//        }
        double payment = sc.nextDouble();

        // Write your code here.
        NumberFormat localPayment;
        localPayment = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + localPayment.format(payment));
        localPayment = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println("India: " + localPayment.format(payment));
        localPayment = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + localPayment.format(payment));
        localPayment = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + localPayment.format(payment));

        // java string intro
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        String array[] = {A, B};
        Arrays.sort(array);
        if(array[0] == A) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        String ACapital = A.substring(0, 1).toUpperCase() + A.substring(1);
        String BCapital = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(ACapital + " " + BCapital);

        // java substring exercise
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(S.substring(start, end));


        String s = "He is a very very good boy, isn't he?";
        String delims = "[ '\'.,?!]+";
        String[] tokens = s.split(delims);
        System.out.println(tokens.length);
        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
