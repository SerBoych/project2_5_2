package edu.boychuk;

import java.util.Arrays;

/**
 * Created by Sergey on 22-Feb-16.
 */
public class MyInt {
    private int arr[] = new int[10];
    {
        for (int i = 0; i <10; i++) {
            arr[i]= (int) (100 * Math.random());
        }
    }
    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }
}
