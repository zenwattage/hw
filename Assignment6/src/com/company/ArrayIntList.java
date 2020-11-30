package com.company;// Class ArrayIntList can be used to store a list of integers.


import java.util.*;

/**
 * Implements various methods to manipulate an array of integers
 */
public class ArrayIntList{

    private int[] elementData; // list of integers
    private int size;          // current number of elements in the list

    public static final int DEFAULT_CAPACITY = 100;

    // post: constructs an empty list of default capacity
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    // pre : capacity >= 0 (throws IllegalArgumentException if not)
    // post: constructs an empty list with the given capacity
    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elementData = new int[capacity];
        size = 0;
    }



    public int sum() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += elementData[i];
        }
        return total;
    }

    public double average() {
        if (isEmpty()) {
            return 0.0;
        } else {
            return (double) sum() / size;
        }
    }

    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: returns the integer at the given index in the list
    public int get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // post: returns true if list is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // post: returns true if the given value is contained in the list,
    //       false otherwise
    public boolean contains(int value) {
        return indexOf(value) >= 0;
    }

    // pre : size() < capacity (throws IllegalStateException if not)
    // post: appends the given value to the end of the list
    public void add(int value) {
        ensureCapacity(size + 1);
        elementData[size] = value;
        size++;
    }

    // pre : size() < capacity (throws IllegalStateException if not) &&
    //       0 <= index <= size() (throws IndexOutOfBoundsException if not)
    // post: inserts the given value at the given index, shifting subsequent
    //       values right
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: removes value at the given index, shifting subsequent values left
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: replaces the integer at the given index with the given value
    public void set(int index, int value) {
        checkIndex(index);
        elementData[index] = value;
    }

    // post: list is empty
    public void clear() {
        size = 0;
    }


    // pre: size() + other.size() <= capacity (throws IllegalStateException
    //      if not)
    // post: appends all values in the given list to the end of this list
    public void addAll(ArrayIntList other) {
        ensureCapacity(size + other.size);
        for (int i = 0; i < other.size; i++) {
            add(other.elementData[i]);
        }
    }

    // post: returns an iterator for this list
    public ArrayIntListIterator iterator() {
        return new ArrayIntListIterator(this);
    }

    // post: ensures that the underlying array has the given capacity; if not,
    //       the size is doubled (or more if given capacity is even larger)
    public void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = elementData.length * 2 + 1;
            if (capacity > newCapacity) {
                newCapacity = capacity;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    // post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    /**
     * lastIndexOf that accepts an integers as a parameter and returns the index
     * in the list of the last occurrence of that value,
     * or -1 if the value is not found in the list.
     * For example, if the list stores [1, 18, 2, 7, 18, 39, 18, 40],
     * then the last index of 18 is 6 and the last index of 3 is -1.
     */
    //post: returns the highest index of the searched for value
    public int lastIndexOf(int value){
        //start at back of arr
        for(int i = elementData.length - 1; i > 0; i--){
                if(elementData[i] == value){
                    return i;
                }
        }
        return -1;
    }

    /**
     * method count that accepts an element value as a parameter and
     * returns the number of occurrences of that value in the list.
     * For example, if the list stores [2, -3, 2, 0, 5, 2, 2, 6].
     * A call of list.count(2) should return 4 because there are four occurrences
     * of that value in the list.
     */
    //post: returns count of searched for value
    public int count(int value){
        int count = 0;
        for(int each : elementData){
            if(each == value){
                count++;
            }
        }
        return count;
    }

    /**
     * method removeLast that removes and returns the last value from a list of integer.
     * For example, if a variable called list stores [8, 17, 42, 3, 8], a call of list.removeLast();
     * should remove 8 and change the list’s state to [8, 17, 42, 3].
     * The next call would return 3 and remove 3 from the list, and so on.
     * If the list is empty, throw a NotSuchElementException.
     * @return
     */

    //pre: size() <= 0 (throws NoSuchElementException)
    //post: returns last value then removes last value
    //      from the array
    public void removeLast() throws NoSuchElementException{

        int count = 0;
        if(elementData.length == 0){
            throw new NoSuchElementException();
        }


        for(int each : elementData){
            if(each != 0){
                count++;
            }
        }

        int[] holder = new int[count - 1];


        for(int i = 0 ; i < holder.length; i ++){

            holder[holder.length -1] = 0;
            //System.out.println(elementData[i]);
            if(elementData[i] != 0){

                holder[i] = elementData[i];
            }

        }
        System.out.println(holder[holder.length - 1]);
        remove(holder.length);
    }
    //pre: list.size > 0
    //post: double the size of the list by appending a copy to the end of the original list
    public void doubleList(){
        //copy element data
        //forwards and backwards
        int[] copy = new int[size * 2]; //double the size of the first list
        int i = 0;
        for(int each : elementData){
        }
        System.out.println(copy);


    }







}
