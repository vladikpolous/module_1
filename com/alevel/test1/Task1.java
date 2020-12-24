package com.alevel.test1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 1, 1, 3};
        System.out.println("Unique elements is " + uniqueElements(arr));
    }

    static int uniqueElements(int...Array) {
        Arrays.sort(Array);
        int count =0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = i+1; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    count++;
                    i =j;
                }
            }
        }
        return Array.length - count;
    }
}
