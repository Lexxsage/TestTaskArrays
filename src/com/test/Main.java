package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number n of arrays : ");

        int n = in.nextInt();
        while (n < 0 || n == 0){
            System.out.println("Error. Number must be > 0");
            n = in.nextInt();
        }

        int[][] NArrayList = ArrayList.MakeArrayList(n);

        System.out.println("NArrayList Sorted:");
        for (int i = 0; i < NArrayList.length; i++) {
            for (int j = 0; j < NArrayList[i].length; j++) {
                System.out.print(NArrayList[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
