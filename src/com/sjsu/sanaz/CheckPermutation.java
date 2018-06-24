package com.sjsu.sanaz;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Created by sanazk on 6/22/18.
 */
public class CheckPermutation {

    public static boolean isPermutationUsingHashTable(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        Hashtable<Character, Integer> tracker = new Hashtable<>();
        for(int i = 0; i < s1.length(); i++) {
            tracker.put(s1.charAt(i), i+1);
        }

        for(int j = 0; j < s2.length(); j++){
            if(tracker.get(s2.charAt(j)) == null){
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutationUsingArray(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();

        Arrays.sort(s1Char);
        Arrays.sort(s2Char);
        if(String.valueOf(s1Char).equals(String.valueOf(s2Char))){
            return true;
        }
        return false;
    }
}
