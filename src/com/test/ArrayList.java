package com.test;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ArrayList {
    public static int[][] ArrayList;

    public static int[][] MakeLinearArray(int n){
        final Set<Integer> set = new HashSet<>();
        System.out.println("Choose a diapason of randomizer for massive length:");
        int RandomMax;
        Scanner in = new Scanner(System.in);
        RandomMax = in.nextInt();
        ArrayList = new int[n][];
        for (int i = 0; i<n; i++){
            int length =  NonRepeatedNumber(set, RandomMax);
            LinearArray LineArray= new LinearArray();
            ArrayList[i] = LineArray.MakeLinearArray(length);
        }
        return ArrayList;
    }

    public static int NonRepeatedNumber(Set set, int RandomMax){
        Random random = new Random();
        int  number = random.nextInt(RandomMax);

        while (number<0 || number == 0){
            number = random.nextInt(RandomMax);
        }

        while (!set.add(number)) {
            System.out.println("Error, already have it");
            number = random.nextInt(RandomMax);
        }
        return number;
    }
}



