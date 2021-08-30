package com.example.myplayground.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OOP {
}

interface AdvancedArithmetic{
    int divisor_sum(int n);
}


class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                sum += i;
            }
        }
        return sum;
    }
}

class Animal{
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}
class Adder extends Arithmetic {
}

class Solution{

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
