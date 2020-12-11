package com.company;

import java.util.Arrays;

/**
 * @author Scott Hansford
 * @version TA7
 * @version
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = {1, 18, 2, 7, 18, 39, 20};

        LinkedIntList list = new LinkedIntList();
        for (int each : arr
        ) {
            list.add(each);
        }

        System.out.println("list = " + Arrays.toString(arr));
        System.out.println("list.size() is " + list.size());
        System.out.println("list.index(2) is " + list.indexOf(2));
        //System.out.println("last in list: " + list.get(list.size() - 1));
        System.out.print("list.deleteBack() is ");
        list.deleteBack();
        System.out.println("After list.deleteBack()");
        System.out.println("list = " + list.toString() );
        System.out.println("After list.removeAll(18)");
        System.out.print("list = "); list.removeAll(18);
        System.out.println(list.toString());
        list.doubleList();
        System.out.println("After list.doubleList()");
        System.out.println("list = " + list.toString());

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
