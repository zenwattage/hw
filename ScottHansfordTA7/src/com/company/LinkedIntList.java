package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedIntList {

        // Class LinkedIntList can be used to store a list of integers.
        private ListNode front;  // first value in the list
        // post: constructs an empty list
        public LinkedIntList() {
            front = null;
        }

        // post: returns the current number of elements in the list
        public int size() {
            int count = 0;
            ListNode current = front;
            while (current != null) {
                current = current.next;
                count++;
            }
            return count;
        }

        // pre : 0 <= index < size()
        // post: returns the integer at the given index in the list
        public int get(int index) {
            return nodeAt(index).data;
        }

        // post: creates a comma-separated, bracketed version of the list
        public String toString() {
            if (front == null) {
                return "[]";
            } else {
                String result = "[" + front.data;
                ListNode current = front.next;
                while (current != null) {
                    result += ", " + current.data;
                    current = current.next;
                }
                result += "]";
                return result;
            }
        }

        // post : returns the position of the first occurrence of the given
        //        value (-1 if not found)
        public int indexOf(int value) {
            int index = 0;
            ListNode current = front;
            while (current !=  null) {
                if (current.data == value) {
                    return index;
                }
                index++;
                current = current.next;
            }
            return -1;
        }

        // post: appends the given value to the end of the list
        public void add(int value) {
            if (front == null) {
                front = new ListNode(value);
            } else {
                ListNode current = front;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new ListNode(value);
            }
        }

        // pre: 0 <= index <= size()
        // post: inserts the given value at the given index
        public void add(int index, int value) {
            if (index == 0) {
                front = new ListNode(value, front);
            } else {
                ListNode current = nodeAt(index - 1);
                current.next = new ListNode(value, current.next);
            }
        }

        // pre : 0 <= index < size()
        // post: removes value at the given index
        public void remove(int index) {
            if (index == 0) {
                front = front.next;
            } else {
                ListNode current = nodeAt(index - 1);
                current.next = current.next.next;
            }
        }

        // pre : 0 <= i < size()
        // post: returns a reference to the node at the given index
        private ListNode nodeAt(int index) {
            ListNode current = front;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }

    /**
     * method called removeAll that removes all occurrences of a particular value.
     * For example, if the list stores [1, 18, 2, 7, 18, 39, 18, 40],
     * the call of list.removeAll(18); would change the list to store [1, 2, 7, 39, 40]
     * @param value
     */
    // post :
        public ListNode removeAll( int value) {
            ListNode helper = new ListNode(0);
            helper.next = front;
            ListNode copy = helper;

            while(copy.next != null){
                if(copy.next.data == value){
                    ListNode next = copy.next;
                    copy.next = next.next;
                } else {
                    copy = copy.next;
                }
            }
            return helper.next;
        }

    /**
     * remove the last integer of the list
     */
    // pre:
    public void deleteBack() {
        ListNode current = front;
        ListNode prev = front;


        if(front == null){
            throw new NoSuchElementException();
        }

        while(current.next != null){
            prev = current;
            current = current.next;

            if(current.next == null){
                System.out.println(current.data);
                current.next = null;
            }
        }
        prev.next = null;
    }


    /**
     * method doubleList that doubles the size of a list by
     * appending a copy of the original sequence to the end of the list.
     * For example, if the list stores [1, 8, 2, 7], your method should
     * change it to store [1, 8, 2, 7, 1, 8, 2, 7].
     *
     */
    //pre : size > 0;
    //post: size * 2;
    public void doubleList(){

    }



    public static void main(String[] args) {
            //[1, 18, 2, 7, 18, 39, 20]
        int[] arr = {1, 18, 2, 7, 18, 39, 20};

        LinkedIntList list1 = new LinkedIntList();
        for (int each : arr
             ) {
            list1.add(each);
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(list1.toString());
        list1.removeAll(18);
        System.out.println(list1.toString());
    }
}

