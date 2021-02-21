package com.test;

import java.util.Arrays;
import java.util.Random;

public class LinearArray {
    public static int [] LinearArray;

    public static int[] MakeLinearArray(int length){
        Random random = new Random();

        LinearArray = new int[length];
        for (int i = 0; i<length;i++){
            LinearArray[i] = random.nextInt();
        }

        System.out.println("Show LinearArray");
        for(int i : LinearArray)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        return LinearArray;
    }

    public static int[] SortLinearArr(){
        Arrays.sort(LinearArray);

        for(int i : LinearArray)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        return LinearArray;
    }

    public static int[] SortRevLinearArr(){
        Arrays.sort(LinearArray);
        for (int i = 0; i < LinearArray.length / 2; i++) {
            int tmp = LinearArray[i];
            LinearArray[i] = LinearArray[LinearArray.length - i - 1];
            LinearArray[LinearArray.length - i - 1] = tmp;
        }

        for(int i : LinearArray)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        return LinearArray;
    }
}
