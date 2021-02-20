package com.test;

import java.util.Random;

public class TestMini {
    public static int [] TestMini;
    public static int[] MakeTestMini(int length){
        Random random = new Random();
        TestMini = new int[length];
        for (int i = 0; i<length;i++){
            TestMini[i] = random.nextInt();
        }
        System.out.println("Print LinearArray");
        for(int i : TestMini)
        {
            System.out.println(i + " ");
        }
        return TestMini;
    }
}
