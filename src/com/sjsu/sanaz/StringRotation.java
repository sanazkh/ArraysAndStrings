package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/5/18.
 */
public class StringRotation {

    // Returns true if s2 is substring of s1
    public boolean isSubstring(String s1, String s2){
        if( s1 == null || s2 == null){
            return false;
        }

        if(s1.indexOf(s2) > 0){
            return true;
        }else{
            return false;
        }
    }

    boolean isRotation(String s1, String s2){
        if( s1 == null || s2 == null){
            return false;
        }

        if(s1.length() != s2.length()){
            return false;
        }

        return isSubstring(s1+s2, s2);
    }
}
