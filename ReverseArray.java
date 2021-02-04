package com.company;

public class ReverseArray {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[5];
        for(int i =0; i < array.length; i++){
            array[i] = i;
        }

//        printArray(array);
        printArray(reverse(array));


    }

    public static int[] reverse(int[] array){
        int temp = 0;

        for(int i = 0; i < (array.length / 2); i++){
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }

        return array;

    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + (i + 1) + " is " + array[i]);
        }

    }
}
