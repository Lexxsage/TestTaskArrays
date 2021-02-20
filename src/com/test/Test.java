package com.test;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Test{
    public static int[][] BigTest;
   /* public static void main(String[] argc){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of massive: ");
        int n = in.nextInt();
        BigTest = MakeBigTest(n);
        System.out.println("YYou print BigTest");
        for (int i = 0; i < BigTest.length; i++) {
            for (int j = 0; j < BigTest[i].length; j++) {
                System.out.print(BigTest[i][j] + "\t");
            }
            System.out.println();
        }
    }*/

    public static int[][] MakeBigTest(int n){
        System.out.println("You are in Test");
        final Set<Integer> set = new HashSet<>();
        System.out.print("We will create ");
        System.out.print(n);
        System.out.println(" massive");
        BigTest = new int[n][];

        for (int i = 0; i<n; i++){
            System.out.println("You will create elements Of BigTest");
            int length =  GetRandNum(set);

            System.out.println("You are go to create massive of BigTest");
            TestMini TestMini = new TestMini();
            BigTest[i] = TestMini.MakeTestMini(length);

        }
        return BigTest;
    }

    public static int GetRandNum(Set set) {
        //Random random = new Random();
        System.out.println("You choose length of massive");
        Scanner inl = new Scanner(System.in);
        int length = inl.nextInt();
        while (length < 0 || length == 0) {
            System.out.println("Length <0 or =0");
            length = inl.nextInt();
        }
        while (!set.add(length)) {
            System.out.println("Error, already have it. Choose new length");
            length = inl.nextInt();
        }
        System.out.println("Length is OK");
        return length;
    }

}
