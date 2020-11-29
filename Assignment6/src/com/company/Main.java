package com.company;

import java.lang.reflect.Array;

/**
 * @author Scott Hansford
 * @version AD300 : TA6
 */
public class Main {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
    // [1, 2, 3, 4, 2, 3, 3]
        //int[] arr =  {1, 2, 3, 4, 2, 3, 3};
        ArrayIntList a = new ArrayIntList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(2);
        a.add(3);
        a.add(3);

        Client client = new Client(a);
        System.out.println(client);
        System.out.println(a);
        System.out.println(a.lastIndexOf(2));
        System.out.println(a.lastIndexOf(3));
        System.out.println("count of 3: " + a.count(3));
        System.out.println("count of 2: " + a.count(2));
        a.removeLast();
        System.out.println("last: " + a.toString());

    }
}
