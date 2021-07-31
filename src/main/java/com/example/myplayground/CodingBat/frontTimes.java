package com.example.myplayground.CodingBat;

public class frontTimes {
    public String frontTimesMethod(String str, int n) {
        int frontLengthOfString = 3;
        if(frontLengthOfString > str.length()) {
            frontLengthOfString = str.length();
        }
        String front = str.substring(0, frontLengthOfString);

        String finalString = "";
        for (int i = 0; i < n; i++) {
            finalString = finalString + front;
        }
        return finalString;
    }

    public static void main(String[] args) {
        String str = "Hello my name is Alex Davila!";

        System.out.println(str);
    }
}
