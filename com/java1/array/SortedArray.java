package com.java1.array;

import java.util.StringTokenizer;

public class SortedArray {

    int nrElementeArray;
    int [] array;
    public SortedArray(String nrElemParam,String arrayInputParam){
        nrElementeArray = Integer.parseInt(nrElemParam);
        array = new int[nrElementeArray];
        StringTokenizer stk = new StringTokenizer(arrayInputParam," ");
        int i=0;
        while(stk.hasMoreTokens()){
            array[i] = Integer.parseInt(stk.nextToken());
            i++;
        }
    }

    public void printArray(){
        System.out.println("Nr elem = " + nrElementeArray);
        for(int i=0;i<nrElementeArray;i++){
            System.out.print(array[i]+" ");
        }
    }

    public boolean isInAscOrder(){
        boolean isSorted = true;
        if(nrElementeArray == 1) return true;
        for(int i=1 ; i<nrElementeArray;i++){
            if(array[i] < array[i-1]){
                isSorted = false;
            }
        }
        if(isSorted){
            return true;
        } else {
            return false;
        }
    }
}
