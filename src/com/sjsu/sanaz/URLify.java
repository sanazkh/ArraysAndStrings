package com.sjsu.sanaz;

/**
 * Created by sanazk on 6/23/18.
 */
public class URLify {

    public static String urlify(String input, int length){
        if(length == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
            if(input.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }



    // We assume that our str char array has enough buffer for %20.

    public static void replaceSpaces(char[] str, int length) {
        int spaceCount = 0, newLength = 0;
        for(int i = 0; i < length; i++) {
            if (str[i] == ' ')
                spaceCount++;
        }
        newLength = length + (spaceCount * 2);
        str[newLength] = '\0';
        for(int i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            }
            else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        System.out.println(str);
    }


    public static String urlify(char[] input, int len){
        int newLen = len;
        for(char c: input){
            if(c == ' '){
                newLen += 2;
            }
        }
        int i = 0;
        char[] newInput = new char[newLen];
        for(char c: input){
            if(c == ' '){
                newInput[i] = '%';
                newInput[i+1] = '2';
                newInput[i+2] = '0';
                i += 3;
            }else{
                newInput[i] = c;
                i++;
            }
        }
        return String.valueOf(newInput);
    }
}

