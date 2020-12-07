package com.company;

public class Client {
    public static void main(String[] args) {
        int[] arr = {1, 18, 2, 7, 18, 39, 20};
        LinkedIntList list = new LinkedIntList();
        list.add(arr[0]);
        list.add(arr[1]);
        list.add(arr[2]);
        System.out.println(list.toString());
        /**
         * Sample runs:
         * list = [1, 18, 2, 7, 18, 39, 20]
         * list.size() is 7
         * list.indexOf(2) is 2
         * list.deleteBack() is 20
         * After list.deleteBack()
         * list = [1, 18, 2, 7, 18, 39]
         * After list.removeAll(18)
         * list = [1, 2, 7, 39]
         * After list.doubleList()
         * list = [1, 2, 7, 39, 1, 2, 7, 39]
         */

    }
}
