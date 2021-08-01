package com.example.myplayground.CodingBat;

public class stringBits {
    public String stringBitsMethod(String str) {
        String result = "";
        // Note: the loop increments i by 2
        for (int i = 0; i < str.length(); i+=2) {
            result = result + str.substring(i, i+1);
            // Alternately could use str.charAt(i)
        }
        return result;
    }

    public static String stringSplosion(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            result += str.substring(0, i+1);
        }
        return result;
    }

    public static void main(String[] args) {


        System.out.println(stringSplosion("hello"));

    }
}
