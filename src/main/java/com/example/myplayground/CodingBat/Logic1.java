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

    public int sortaSum(int a, int b) {
        if(((a + b) >= 10) && ((a + b) <= 19)) {
            return 20;
        } else {
            return a + b;
        }
    }

    public String alarmClock(int day, boolean vacation) {

        if((day == 0 || day == 6) && vacation) {
            return "off";
        } else if(day == 0 || day == 6 || vacation) {
            return "10:00";
        } else if(!(day == 0) || !(day == 6)) {
            return "7:00";
        }
        return "7:00";
    }

    public boolean love6(int a, int b) {
        if(a == 6 || b == 6 || (a + b) == 6 || (a - b) == 6 || (b - a) == 6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if((n >= 1 && n <= 10 && !outsideMode) || (outsideMode && (n <= 1 || n >= 10))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean specialEleven(int n) {
        if(n % 11 == 0 || n % 11 == 1) {
            return true;
        }
        return false;
    }

    public boolean more20(int n) {
        if(n % 20 == 1 || n % 20 == 2) {
            return true;
        }
        return false;
    }

    public boolean old35(int n) {
        if((n % 3 == 0 || n % 5 == 0) && !(n % 3 == 0 && n % 5 == 0)) {
            return true;
        }
        return false;
    }

    public boolean less20(int n) {
        if(n % 20 == 19 || n % 20 == 18) {
            return true;
        }
        return false;
    }

    public boolean nearTen(int num) {
        if(num % 10 == 0 || num % 10 == 1 || num % 10 == 2 || num % 10 == 9 || num % 10 == 8) {
            return true;
        }
        return false;
    }

    public int teenSum(int a, int b) {
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep || (isMorning && !isMom)) {
            return false;
        } else if((isMorning && isMom) && !isAsleep) {
            return true;
        } else if(isMom) {
            return true;
        }
        return true;
    }

    public int teaParty(int tea, int candy) {
        if(tea < 5 || candy < 5) {
            return 0;
        } else if(tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else if(tea >= 5 || candy >= 5) {
            return 1;
        }
        return 1;
    }

    public String fizzString(String str) {
        String[] letters = str.split("");
        for(int i = 0; i < letters.length; i++) {
            if(letters[0].toLowerCase() == "f" && letters[letters.length - 1].toLowerCase() == "b") {
                return "FizzBuzz";
            }else if(letters[0].toLowerCase() == "f") {
                return "Fizz";
            } else if(letters[letters.length - 1].toLowerCase() == "b") {
                return "Buzz";
            }
        }
        return str;
    }

}
