package com.example.myplayground.hackerrank;

import java.util.Scanner;

public class Java {

    // java static initializer block
    static Scanner input = new Scanner(System.in);
    static boolean flag = true;
    static int B = input.nextInt();
    static int H = input.nextInt();

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
    }
}
