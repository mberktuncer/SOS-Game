package com.kodluyoruz.mbtuncer;

public class Array {
    public static void main(String[] args) {
        int[][] matris = {
                {0, 1, 2, 3, 4},
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6 }
        };

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.println(matris[i][j]);
            }
        }

        for (int[] values : matris) {
            for (int value: values) {
                System.out.println(value);
            }
        }
    }
    public static void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length -1) System.out.print(" , ");
        }
    }
}
