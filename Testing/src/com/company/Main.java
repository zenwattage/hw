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

        Queue <Integer> q = new LinkedList<>();
        q.add(3);
        q.add(5);
        q.add(9);
        q.add(q.remove());
        q.add(2);
        q.add(4);
        q.add(q.remove());
        q.add(q.remove());
        q.add(1);
        q.add(8);
        System.out.println(q.toString());
    }
}
