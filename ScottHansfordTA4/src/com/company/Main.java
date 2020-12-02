package com.company;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Scott Hansford
 * @version AD300 Assignment 4
 * @version Sort list of students by score into descending order
 */

public class Main {

    /**
     * Sort an array of integers in descending order (insertion sort)
     * @param nums array of integers
     */
    public static void MySort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int value = nums[i];
            int last = i - 1;
            while(last >= 0 && nums[last] < value){
                nums[last + 1] = nums[last];
                last = last - 1;
            }
            nums[last + 1] = value;
        }

    }

    /**
     * Main testing method
     * @param args cli arguments
     */
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");

        size = scanner.nextInt();
        String[] names = new String[size];
        int[] scores = new int[size];

        for (int i = 0; i < size ; i++){
            System.out.println("Enter a student name: ");
            names[i] = scanner.next().strip();

            System.out.println("Enter a student score: ");
            scores[i] = scanner.nextInt();
        }

        MySort(scores);

        for (int i = 0 ; i < scores.length ; i++){
            
        }

        Arrays.parallelSort(names);

        for(int i = 0; i < size ; i++){
            System.out.println(names[i] + " " + scores[i] + ".0");
        }


    }
}
