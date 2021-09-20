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
        } else if (a > 21 && b <= 21) {
            return b;
        } else if (b > 21 && a <= 21) {
            return a;
        }
        return 0;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        if (c - b == b - a || a - b == b - c || b - a == a - c || b - c == c - a) {
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
        if (goal >= 5) {
            if (goal / 5 >= big) {
                goal -= big * 5;
            } else {
                goal = goal % 5;
            }
        }
        if (goal <= small) {
            return goal;
        }
        return -1;
    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        int smaller = 5000;
        int bigger = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > bigger) {
                bigger = nums[i];
            }
            if (nums[i] < smaller) {
                smaller = nums[i];
            }
        }
        return bigger - smaller;
    }

    public int centeredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        sum = sum - max - min;
        sum = sum / (nums.length - 2);
        return sum;
    }

    //    public int sum13(int[] nums) {
//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 13) {
//                break;
//            }
//            result += nums[i];
//        }
//        return result;
//    }
    public int sum13(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                continue;
            }
            if (i > 0 && nums[i - 1] == 13) {
                    continue;
            }
            result += nums[i];
        }
        return result;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean ignore = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 6) {
                ignore = true;
            }
            if(ignore == false) {
                sum += nums[i];
            }
            if(ignore && nums[i] == 7) {
                ignore = false;
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        String iterator = "";
        for(int i = 0; i < nums.length; i++) {
            iterator += Integer.toString(nums[i]);
            if(iterator.equals("2")) {
                continue;
            }
            if(iterator.equals("22")) {
                return true;
            }
            iterator = "";
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        int iterator = 0;
        boolean trece = true;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 || nums[i] == 3) {
                trece = false;
            }
        }
        return trece;
    }

    public boolean has1And3(int[] nums) {
        int iterator = 0;
        boolean trece = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 || nums[i] == 3) {
                iterator++;
            }
            if(iterator == 2) {
                trece = true;
            }
        }
        return trece;
    }

    public boolean sum28(int[] nums) {
        int iterator = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 2) {
                iterator += 2;
            }
        }
        if(iterator == 8) {
            return true;
        }
        return false;
    }

    public boolean more14(int[] nums) {
        int oneIterator = 0;
        int fourIterator = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                oneIterator++;
            }
            if(nums[i] == 4) {
                fourIterator++;
            }
        }
        if(oneIterator > fourIterator) {
            return true;
        }
        return false;
    }

    public int[] fizzArray(int n) {
        int[] newArray = new int[n];
        for(int i = 0; i < n; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public boolean only14(int[] nums) {
        int iterator = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 || nums[i] == 4) {
                iterator++;
            }
        }
        if(iterator == nums.length) {
            return true;
        }
        return false;
    }

    public String[] fizzArray2(int n) {
        String[] newArray = new String[n];
        for(int i = 0; i < n; i++) {
            newArray[i] = Integer.toString(i);
        }
        return newArray;
    }

    public boolean no14(int[] nums) {
        int oneIterator = 0;
        int fourIterator = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                oneIterator++;
            }
            if(nums[i] == 4) {
                fourIterator++;
            }
        }
        if(oneIterator > 0 && fourIterator > 0) {
            return false;
        } else return (oneIterator > 0 && fourIterator == 0) || (oneIterator == 0 && fourIterator > 0) || (oneIterator == 0 && fourIterator == 0);
    }

    public boolean isEverywhere(int[] nums, int val) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != val && nums[i + 1] != val)
                return false;
        }
        return true;
    }

    public boolean either24(int[] nums) {
        int twoiterator = 0;
        int fouriterator = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 2 && nums[i + 1] == 2) {
                twoiterator += 1;
            }
            if(nums[i] == 4 && nums[i + 1] == 4) {
                fouriterator += 1;
            }
        }
        return (twoiterator != 1 || fouriterator != 1) && (twoiterator != 0 || fouriterator != 0);
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int iterator = 0;
        for(int i = 0; i < nums1.length; i++) {
            if(Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i])
                iterator++;
        }

        return iterator;
    }
    
    public boolean has77(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 7 && (nums[i + 1] == 7 || (i < nums.length - 2 && nums[i + 2] ==7))) {
                return true;
            } 
        }
        return false;
    }
    
    public boolean has12(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                for(int j = i; j < nums.length; j++) {
                    if(nums[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(12 / 10);
        System.out.println(Math.abs(84 - 4230));
    }
}
