package org.progmatic.edu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int)(Math.random()*100+1);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(minArr(numbers));
    }

    public static int minArr(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
