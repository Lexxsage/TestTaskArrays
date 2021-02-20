package com.test;

import java.util.Random;
import java.util.Scanner;

public class LinearArray {
    public static int [] LinearArray;
    public static int[] MakeLinearArray(int length){
        Random random = new Random();
        LinearArray = new int[length];
        for (int i = 0; i<length;i++){
            LinearArray[i] = random.nextInt();
        }
        return LinearArray;
    }
}
