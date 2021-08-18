package com.example.myplayground.CodingBat;

public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        if(goal > (big*5 + small) ) { //Not enough total
            return false;
        } else {
            return goal % 5 <= small; //Check if there are enough small bricks
        }
    }
}
