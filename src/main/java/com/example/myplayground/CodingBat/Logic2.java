package com.example.myplayground.CodingBat;

public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        if (goal > (big * 5 + small)) { //Not enough total
            return false;
        } else {
            return goal % 5 <= small; //Check if there are enough small bricks
        }
    }

    public int loneSum(int a, int b, int c) {
        int aNew = a;
        int bNew = b;
        int cNew = c;

        if (aNew == bNew) {
            a = 0;
            b = 0;
        }
        if (aNew == cNew) {
            a = 0;
            c = 0;
        }
        if (bNew == cNew) {
            b = 0;
            c = 0;
        }
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        int aNew = a;
        int bNew = b;
        int cNew = c;

        if (aNew == 13) {
            a = 0;
            b = 0;
            c = 0;
        }
        if (bNew == 13) {
            b = 0;
            c = 0;
        }
        if (cNew == 13) {
            c = 0;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (13 <= n && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int numRight = num % 10;
        if (numRight < 5) {
            return num - (numRight);
        } else {
            return num + (10 - numRight);
        }
    }

//    public boolean closeFar(int a, int b, int c) {
//        if((Math.abs(a - b) <= 1 || Math.abs(a - c) <= 1) && (Math.abs(a - b) > 1 || Math.abs(a - c) > 1) || Math.abs(b - c) > 1) {
//            return true;
//        }
//        return false;
//    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1) {
            if (Math.abs(c - a) > 1 && Math.abs(c - b) > 1) {
                return true;
            }
        } else if (Math.abs(a - c) <= 1) {
            if (Math.abs(b - a) > 1 && Math.abs(b - c) > 1) {
                return true;
            }
        }
        return false;
    }

//    public int blackjack(int a, int b) {
//        if(Math.abs(21 - a) < Math.abs(21 - b) && a <= 21) {
//            return a;
//        } else if(Math.abs(21 - b) < Math.abs(21 - a) && b <= 21) {
//            return b;
//        }
//        return 0;
//    }

    public int blackjack(int a, int b) {
        if (a <= 21 && b <= 21) {
            if ((21 - a) < (21 - b)) {
                return a;
            } else {
                return b;
            }
        } else if(a > 21 && b <= 21) {
            return b;
        } else if(b > 21 && a <= 21){
            return a;
        }
        return 0;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        if(c - b == b - a || a - b == b - c || b - a == a - c || b - c == c - a) {
            return true;
        }
        return false;
    }

//    public int makeChocolate(int small, int big, int goal) {
//        int minusBigBars = goal - (5 * big);
//        int result = minusBigBars - small;
//        if(result < 0) {
//            if(small + result <) {
//                return small + result;
//            }
//
//        }
//        return small - result;
//    }

//    public int makeChocolate(int small, int big, int goal) {
//        int bigInKilos = 5 * big;
//        int minusBigBars = 0;
//        int result = 0;
//        if((bigInKilos < goal && bigInKilos + small >= goal) || bigInKilos == goal) {
//            minusBigBars = goal - bigInKilos;
//            result = minusBigBars - small;
//            return small - Math.abs(result);
//        } else if(bigInKilos > goal) {
//            result =  -(bigInKilos - goal);
//            return result;
//        }
//        return -1;
//    }

    public int makeChocolate(int small, int big, int goal) {
        if(goal >= 5){
            if(goal / 5 >= big) {
                goal -= big * 5;
            } else {
                goal = goal % 5;
            }
        }
        if(goal <= small) {
            return goal;
        }
        return -1;
    }



    public static void main(String[] args) {
        System.out.println(12 / 10);
        System.out.println(Math.abs(84 - 4230));
    }
}
