package com.sjsu.sanaz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by sanazk on 6/23/18.
 */
public class PalindromePermutation {

    public static boolean isPalFromPerm(String a){

        if(a.length() == 0 || a == null){
            return false;
        }
        String b = a.replaceAll("\\s+","");
        int leng = b.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < leng; i++){
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
        }
        int numberOfEven = 0;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            int value = (int) mapElement.getValue();
            if((value % 2) == 1){
               numberOfEven++;
            }
        }
        if(((leng%2) != 0 && numberOfEven != 1) || ((leng%2) == 0 && numberOfEven == 1)){
            return false;
        }

        return true;
    }

}
