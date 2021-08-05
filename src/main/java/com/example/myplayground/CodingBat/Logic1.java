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
}
