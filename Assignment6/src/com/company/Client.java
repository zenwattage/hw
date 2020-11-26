package com.company;

public class Client {
    private ArrayIntList list;
    private int[] intlist;
    private ArrayIntListIterator i;

    public Client(){
        this.list = list;
        this.i = list.iterator();
    }


        public void main(String[] args) {
            // construct and print list
            int[] data = {1, 2, 3, 4, 2, 3, 3};
            ArrayIntList list = new ArrayIntList();
            for (int n : data) {
                list.add(n);
            }
            System.out.println("list = " + list);

            // obtain an iterator to find the product of the list, removing zeros
            ArrayIntListIterator i = list.iterator();
            int product = 1;
            while (i.hasNext()) {
                int n = i.next();
                if (n == 0) {
                    i.remove();
                } else {
                    product *= n;
                }
            }
            System.out.println("list now = " + list);
            System.out.println("product = " + product);
        }
    }

