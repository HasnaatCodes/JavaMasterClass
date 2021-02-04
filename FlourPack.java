package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canPack(1, 0, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        bigCount *= 5;
        int sum = bigCount + smallCount;
        int remainder = goal % 5;

        if (sum < goal) {
            return false;
        } else {
            return remainder <= smallCount;
        }
    }
}
