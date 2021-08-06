package com.example.myplayground.CodingBat;

public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(cigars >= 40) {
            if(cigars <= 60 || isWeekend == true) {
                return true;
            }
        }
        return false;
    }

    public int dateFashion(int you, int date) {
        // if ((you + date) >= 8) {
        //   return 2;
        // } else if((you + date) <= 2) {
        //   return 0;
        // } else {
        //   return 1;
        // }
        if(you <= 2 || date <= 2) {
            return 0;
        } else if(you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(temp >= 60) {
            if(temp <= 90 || (isSummer == true && temp <= 100)) {
                return true;
            }
        }
        return false;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {

        if(speed <= 60 || (isBirthday && speed <= 65)) {
            return 0;
        } else if(speed <= 80 || (isBirthday && speed <= 85)) {
            return 1;
        } else if(speed >= 81 && !isBirthday) {
            return 2;
        } else {
            return 2;
        }
    }
}
