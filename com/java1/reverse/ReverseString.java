package com.java1.reverse;

public class ReverseString {

    public ReverseString(){

    }
    public static String reverseTheString(String input){

        int noOfChars= input.length();
        String result="";
        int index=0;
        for(int i=noOfChars-1 ;i>=0;i--){
            result=result+input.charAt(i);

        }


        return result;
    }

    public static String reverseTheString2(String input){
        StringBuffer sb = new StringBuffer(input);
        return sb.reverse().toString();

    }

    //StringBuilder str = new StringBuilder();
    public static String reverseTheString3(String input){
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();

    }

    public static String reverseTheString4(String input){

        int noOfChars= input.length();

        char[] charArray = new char[noOfChars];

        for(int i=0;i<noOfChars/2;i++){
            charArray[i] = input.charAt(noOfChars-i-1);
            charArray[noOfChars-i-1] = input.charAt(i);
        }
        String result="";
        for(int i=0;i<noOfChars;i++){
            result=result+charArray[i];
        }

        return result;

    }
}
