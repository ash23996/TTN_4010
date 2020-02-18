package com.first;
import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println("Array1 : "+Arrays.toString(array1));
        System.out.println("Array2 : "+Arrays.toString(array2));

        for (int ele1 = 0; ele1 < array1.length; ele1++) {
            for (int ele2 = 0; ele2 < array2.length; ele2++) {
                if(array1[ele1] == (array2[ele2])) {
                    System.out.println("Common element is : "+(array1[ele1]));
                }
            }
        }

    }
}
