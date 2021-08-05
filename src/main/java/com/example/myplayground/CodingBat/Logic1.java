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
}
