package com.sjsu.sanaz;

public class ReverseString {

    public static String reverse(String input){
        if(input.length() == 0 || input == null){
            return input;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = input.length() - 1; i>=0; i--){
            sb.append(input.charAt(i));
        }

        return sb.toString();

    }
}
