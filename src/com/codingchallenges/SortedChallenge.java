package com.codingchallenges;

//Implement the method isSortedAndHow, which accepts an array of integers, and returns one of the following:
//
//        'yes, ascending' - if the numbers in the array are sorted in an ascending way
//        'yes, descending' - if the numbers in the array are sorted in a descending way
//        'no'
//        You can assume the array will always be valid, and there will always be one correct answer.

public class SortedChallenge {
    public static String isSortedAndHow(int[] array) {
        String output = "";
        int switchCounter = 0; // 0 - uninitiated, 1 - ascending, 2 - descending, 3 - switched
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1] && switchCounter != 2) {
                switchCounter = 1;
            } else if (array[i] > array[i + 1] && switchCounter != 1) {
                switchCounter = 2;
            } else {
                switchCounter = 3;
            }
        }

        if (switchCounter == 1) {
            output = "yes, ascending";
        } else if (switchCounter == 2) {
            output = "yes, descending";
        } else if (switchCounter == 3) {
            output = "no";
        }
        return output;
    }


}
