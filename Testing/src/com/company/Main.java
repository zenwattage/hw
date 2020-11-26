package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void swap(double[] list, int i, int j){
        double temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }


    public static void selectionSort(double[] a){
        for(int i = 0; i < a.length -1; i++){
            int smallest = i;
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[smallest]){
                    smallest = j;
                }
            }
            swap(a,i,smallest);
        }
    }

    public static void main(String[] args) {
	// write your code here
    int[] scores = {62, 35, 13, 40, 20};


    int search = Arrays.binarySearch(scores,20);
        System.out.println(search);
//        for(int each : scores){
//            System.out.println(each);
//        }
//
//        Arrays.sort(scores);
//
//        for(int each : scores){
//            System.out.println(each);
//        }

        double[] list = {3.1, 3.1, 2.5, 6.4, 2.1};

        selectionSort(list);
        for(double each: list){
            System.out.println(each);
        }

//        Stack<String> s = new Stack<>();
//
//        Queue<String> q = new LinkedList<>();
//
//        s.push("how");
//
//        s.push("are");
//
//        s.push("you");
//
//        while (!s.isEmpty()){
//
//            q.add(s.pop());
//
//        }
//
//        System.out.println(q);
        Stack<Integer> s = new Stack<>();

        s.push(7);

        s.push(10);

        System.out.print(s.pop());

        System.out.print(s.peek());

        s.push(3);

        s.push(5);

        System.out.print(s.pop());

        System.out.print(s.isEmpty());



    }
}
