package com.sjsu.sanaz;

import java.util.HashSet;

/**
 * Created by sanazk on 6/22/18.
 */
public class IsUnique {

    //Using HashSet
    public static boolean isUniqueHashSet(String inputString){
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


    public static boolean isUniqueLoop(String inputString){

        for(int i = 0; i < inputString.length(); i++){
            for(int j = i+1; j < inputString.length(); j++){
                if(inputString.charAt(i) == inputString.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }
}
