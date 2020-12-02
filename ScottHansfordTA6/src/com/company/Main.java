package com.company;

/**
 * @author Scott Hansford
 * @version AD300 : TA6
 * @version 11/28/2020
 * @version Copy and mirror Integers
 */
public class Main {

    /**
     * Test our ArrayIntList class
     * @param args
     */
    public static void main(String[] args) {

        ArrayIntList list = new ArrayIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println("Sample runs:");
        System.out.println("list = " + list);
        System.out.println("list.lastIndexOf(2) is " + list.lastIndexOf(2));
        System.out.println("list.count(2) is " + list.count(2));
        System.out.print("list.removeLast() is " );
        list.removeLast();
        System.out.println("After list.removeLast()");
        System.out.println("list = " + list);
        System.out.println("After list.doubleList()");
        list.doubleList();



    }
}
