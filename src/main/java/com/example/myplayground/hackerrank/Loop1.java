package com.example.myplayground.hackerrank;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {

        int N = 2;
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.printf("%d x %d = %d\n", N, i, result);
        }

        // still working on this one, havent done console prints in a while
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if(a + b <= 2) {
                System.out.print((a + (b * 1)) + " ");
            } else {
                System.out.print((a + (b * 1) + (a+b) * (a+b)) + " ");
            }

            // else if((a + (b * 1) + (a+b) * (a+b))) {
            //     System.out.print((a + (b * 1) + (a+b) * (a+b)) + " ");
            // }
            // System.out.print();
        }

    }
}
