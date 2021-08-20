package com.example.myplayground.CodingBat;

public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        if(goal > (big*5 + small) ) { //Not enough total
            return false;
        } else {
            return goal % 5 <= small; //Check if there are enough small bricks
        }
    }

    public int loneSum(int a, int b, int c) {
        int aNew = a;
        int bNew = b;
        int cNew = c;

        if(aNew == bNew) {
            a = 0;
            b = 0;
        }
        if(aNew == cNew) {
            a = 0;
            c = 0;
        }
        if(bNew == cNew) {
            b =0;
            c = 0;
        }
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        int aNew = a;
        int bNew = b;
        int cNew = c;

        if(aNew == 13) {
            a = 0;
            b = 0;
            c = 0;
        }
        if(bNew == 13) {
            b = 0;
            c = 0;
        }
        if(cNew == 13) {
            c = 0;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if(13 <= n && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int numRight = num % 10;
        if(numRight < 5) {
            return num - (numRight);
        } else {
            return num + (10 - numRight);
        }
    }

    public static void main(String[] args) {
        System.out.println(12 / 10);
    }
}
