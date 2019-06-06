package com.sjsu.sanaz;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by sanazk on 6/22/18.
 */
public class IsUnique {

    /*
    Space complexity: O(n)
    Time complexity: O(n)
     */
    //Using HashSet
    public static boolean isUniqueHashSet(String inputString){
        if(inputString.length() == 0 || inputString == null){
            return false;
        }

        HashSet<Character> tracker = new HashSet<>();

        for(int i = 0; i < inputString.length(); i++){
            if(tracker.contains(inputString.charAt(i))){
                return false;
            }else{
                tracker.add(inputString.charAt(i));
            }
        }
        return true;
    }

    /*
        Space complexity: O(n)
        Time complexity: O(n^2)
         */
    public static boolean isUniqueLoop(String inputString){
        if(inputString.length() == 0 || inputString == null){
            return false;
        }
        for(int i = 0; i < inputString.length(); i++){
            for(int j = i+1; j < inputString.length(); j++){
                if(inputString.charAt(i) == inputString.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }


    /*
    Space complexity: O(n)
    Time complexity: O(n log n) -- sorting
     */

    public static boolean isUniqueOpt(String inputString){
        if(inputString.length() == 0 || inputString == null){
            return false;
        }
        char[] arr = inputString.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                return false;
            }
        }
        return true;
    }

}
