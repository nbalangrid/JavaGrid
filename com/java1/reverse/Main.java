package com.java1.reverse;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduceti sirul: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

       // ReverseString rs = new ReverseString();
        System.out.println("Output 1: "+ReverseString.reverseTheString(s));
        System.out.println("Output 2: "+ReverseString.reverseTheString2(s));
        System.out.println("Output 3: "+ReverseString.reverseTheString3(s));
        System.out.println("Output 4: "+ReverseString.reverseTheString4(s));


    }

}
