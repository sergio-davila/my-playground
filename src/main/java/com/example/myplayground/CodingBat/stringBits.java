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

    public int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {


        System.out.println(stringSplosion("hello"));

    }
}
