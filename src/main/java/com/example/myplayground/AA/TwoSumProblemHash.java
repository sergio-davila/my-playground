package com.example.myplayground.AA;

import java.util.HashMap;

public class TwoSumProblemHash {
    public static void main(String[] args) {
        //declare HashMap object
        //HashMap <type of key, type of value>
        // = new HashMap<type of key, type of value>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //Adding an element into HashMap
        map.put(4, 7);
        //Finding an element from HashMap by index
        int value = map.get(4);
        //Checking whether the key is in HashMap or not.
        boolean contain = map.containsKey(4);
    }

}
