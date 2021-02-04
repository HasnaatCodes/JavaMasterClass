package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {5, 4, 3, 2, 1};

        int[] array = getIntegers(5);
        printArray(sortArray(array));
    }

    public static int[] getIntegers(int size){
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " numbers");

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }

    }

    public static int[] sortArray(int[] array){
        int temp = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }

        return array;
    }
}
