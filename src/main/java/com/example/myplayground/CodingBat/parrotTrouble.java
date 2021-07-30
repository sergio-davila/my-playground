package com.example.myplayground.CodingBat;

public class parrotTrouble {
    public boolean parrotTroubleMethod(boolean talking, int hour) {
        if(talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }
}
