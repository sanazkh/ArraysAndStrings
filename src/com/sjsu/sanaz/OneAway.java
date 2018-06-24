package com.sjsu.sanaz;

import java.util.Hashtable;

/**
 * Created by sanazk on 6/23/18.
 */
public class OneAway {

    public static boolean oneAway(String s1, String s2){
        int a = s1.length();
        int b = s2.length();
        if(Math.abs(a - b) > 1){
            return false;
        }
        if(a == b) {
            if (!s1.equals(s2)) {
                 return false;
            }
        }else{
            Hashtable<Character, Integer> tracker = new Hashtable<>();
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();
            int counter = 0;
            if(a < b){

                for(int i = 0; i < a; i++){
                    tracker.put(s1Array[i], i);
                }
                for(int i = 0; i < b; i++){
                    if(tracker.get(s2Array[i]) == null){
                        counter++;
                    }
                }
                if(counter > 1){
                    return false;
                }
            }else{

                for(int i = 0; i < b; i++){
                    tracker.put(s2Array[i], i);
                }
                for(int i = 0; i < a; i++){
                    if(tracker.get(s1Array[i]) == null){
                       counter++;
                    }
                }
                if(counter > 1){
                    return false;
                }
            }
        }

        return true;
    }
}
