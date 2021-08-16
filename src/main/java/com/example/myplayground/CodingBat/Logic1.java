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

//    public String fizzString(String str) {
//        String[] letters = str.split("");
//        for(int i = 0; i < letters.length; i++) {
//            if(letters[0].toLowerCase() == "f" && letters[letters.length - 1].toLowerCase() == "b") {
//                return "FizzBuzz";
//            }else if(letters[0].toLowerCase() == "f") {
//                return "Fizz";
//            } else if(letters[letters.length - 1].toLowerCase() == "b") {
//                return "Buzz";
//            }
//        }
//        return str;
//    }

    public String fizzString(String str) {
        String[] letters = str.split("");
        if(letters[0].toLowerCase().equals("f") && letters[letters.length - 1].toLowerCase().equals("b")) {
            return "FizzBuzz";
        } else if(letters[0].toLowerCase().equals("f")) {
            return "Fizz";
        } else if(letters[letters.length - 1].toLowerCase().equals("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    public String fizzString2(int n) {
        if(n % 15 == 0) {
            return "FizzBuzz!";
        }
        if(n % 3 == 0) {
            return "Fizz!";
        }
        if(n % 5 == 0) {
            return "Buzz!";
        }
        return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        if(a + b == c || a + c == b || b + c == a) {
            return true;
        }
        return false;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if((bOk == false && b > a && b < c) || (bOk == true && b < c)) {
            return true;
        }
        return false;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if((equalOk == false && a < b && b < c) || (equalOk == true && a <= b && b <= c)) {
            return true;
        }
        return false;
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
    }

    public boolean lessBy10(int a, int b, int c) {
        if(a - b >= 10 || b - a >= 10 || c - a >= 10 || c - b >= 10 || a - c >= 10 || b - c >= 10) {
            return true;
        }
        return false;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles && die1 == die2) {
            if(die2 == 6) {
                die2 = 1;
            } else {
                die2++;
            }
            return die1 + die2;
        }
        return die1 + die2;
    }

//    public int maxMod5(int a, int b) {
//        if(a == b) {
//            return 0;
//        } else if(a % 5 == b % 5) {
//            if(a < b) {
//                return a;
//            } else {
//                return b;
//            }
//        } else {
//            if(a > b) {
//                return a;
//            } else {
//                return b;
//            }
//        }
//    }

    public int maxMod5(int a, int b) {
        if(a == b) {
            return 0;
        } else if(a % 5 == b % 5) {
            return Math.min(a, b);
        } else {
            return Math.max(a, b);
        }
    }

    public int redTicket(int a, int b, int c) {
        if(a == 2 && b == 2 && c ==2) {
            return 10;
        } else if(a == b && b == c) {
            return 5;
        } else if(a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    public int greenTicket(int a, int b, int c) {
        if(a == b && b == c) {
            return 20;
        } else if(a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public int blueTicket(int a, int b, int c) {
        if(a + b == 10 || a + c == 10 || b + c == 10) {
            return 10;
        } else if(a + b == (10 + a + c) || a + b == (10 + b + c)) {
            return 5;
        } else {
            return 0;
        }
    }

    public boolean shareDigit(int a, int b) {
        int aLeft = a/10;
        int aRight = a%10;
        int bLeft = b/10;
        int bRight = b%10;
        if(aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight) {
            return true;
        }
        return false;
    }

    public boolean shareDigitSimplified(int a, int b) {
        int aLeft = a/10;
        int aRight = a%10;
        int bLeft = b/10;
        int bRight = b%10;
        return aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight;
    }

    public int sumLimit(int a, int b) {
        String aString = String.valueOf(a);
//        String bString = String.valueOf(b);
        int aLength = aString.length();
//        int bLength = bString.length();
        if(String.valueOf(a + b).length() == aLength) {
            return a + b;
        }
        return a;
    }


    public static void main(String[] args) {
        int a = 12;
        int aLeft = a/10;
        int aRight = a%10;
        System.out.println(aLeft);
        System.out.println(aRight);
    }
}
