package com.OptimusPrime;

import java.util.ArrayList;

public class Main {

    public static void sieve(int n){
        boolean[] listOfInt = new boolean[n];
        listOfInt[0] = true;
        ArrayList<Integer> listOfPrimes = new ArrayList<>();

        int index = 1;
        while (index+1 <= Math.sqrt(n)){
            listOfPrimes.add(index+1);
            for (int i = index; i < listOfInt.length; i += index+1) {
                listOfInt[i] = true;
            }
            for (int i = index; i < listOfInt.length ; i++) {
                if (!listOfInt[i]) {
                    index = i;
                    break;
                }
            }
        }
        for (int i = index; i < listOfInt.length; i++){
            if (!listOfInt[i]) listOfPrimes.add(i+1);
        }
        System.out.print(listOfPrimes);
    }

    public static void main(String[] args) {
	    int n = 103;
	    sieve(n);
    }
}
