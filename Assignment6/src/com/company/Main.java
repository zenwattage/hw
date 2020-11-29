package com.company;


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
        ArrayIntList list = new ArrayIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println("list = " + list);
        System.out.println("list.lastIndexOf(2) is " + list.lastIndexOf(2));
        System.out.println("list.count(2) is " + list.count(2));
        list.removeLast();
        System.out.println("After a.removeLast()");
        System.out.println(list);

    }
}
