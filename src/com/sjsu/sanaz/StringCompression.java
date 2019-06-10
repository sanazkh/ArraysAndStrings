package com.sjsu.sanaz;

import java.util.ArrayList;

/**
 * Created by sanazk on 6/27/18.
 */
public class StringCompression {

    public static String compressor(String a){
        StringBuilder sb = new StringBuilder();
        int tracker = 1;
        for(int i = 0; i < a.length(); i++){
            char current = a.charAt(i);
            if( i + 1 < a.length() && current == a.charAt(i+1)){
                tracker++;
            }else{
                sb.append(current);
                sb.append(tracker);
                tracker = 1;
            }
        }
        String res = sb.toString();
        if(res.length() < a.length()){
            return res;
        }else{
            return a;
        }
    }

    public static String StringCompressor(String input){


        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for(int i = 0; i < input.length(); i++){
            counter++;
            if (i+1 >= input.length() || input.charAt(i) != input.charAt(i+1)){
                sb.append(input.charAt(i));
                sb.append(counter);
                counter = 0;

            }
        }

        if(sb.length() > input.length()){
            return input;
        }else{

            String output = sb.toString();
            return output;
        }

    }
}
