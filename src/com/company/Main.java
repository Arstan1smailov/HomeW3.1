package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] anArray = new Random().doubles(15).toArray();
        //System.out.println(Arrays.toString(anArray));
        for (double v : anArray) {
            if (v < 0) {
                break;
            }
            System.out.println(v / anArray.length);
        }
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < anArray.length - 1; i++) {
                if (anArray[i] > anArray[i + 1]) {
                    isSorted = false;

                    buf = (int) anArray[i];
                    anArray[i] = anArray[i + 1];

                    anArray[i + 1] = buf;
                    System.out.println(Arrays.toString(anArray));
                }
            }
        }
    }
}