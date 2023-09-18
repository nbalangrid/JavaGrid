package com.java1.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduceti parametrii :");
        Scanner scanner = new Scanner(System.in);
        String nrElemAsString = scanner.nextLine();
        String arrayAsString = scanner.nextLine();

        SortedArray sa = new SortedArray(nrElemAsString,arrayAsString);
        sa.printArray();
        System.out.println();
        System.out.println(sa.isInAscOrder());
    }
}
