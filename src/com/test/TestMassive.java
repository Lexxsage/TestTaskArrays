package com.test;

import javax.print.attribute.standard.MediaSize;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TestMassive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of massive: ");
        int n = in.nextInt();
        int[][] NArray = Test.MakeBigTest(n);
        System.out.println("You print NARray");
        for (int i = 0; i < NArray.length; i++) {
            for (int j = 0; j < NArray[i].length; j++) {
                System.out.print(NArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
