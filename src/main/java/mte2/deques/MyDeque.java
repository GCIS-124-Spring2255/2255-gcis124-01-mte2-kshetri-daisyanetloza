// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;

public class MyDeque<E> implements Deque<E> {
    private final LinkedList<E> list;
    
    public MyDeque() {    
        list = new LinkedList<>();    
    }

    @Override
    public void enqueueFront(E element) {

    }

    @Override
    public void enqueueBack(E element) {

    }

    @Override
    public E dequeueFront() {

    }

    @Override
    public E dequeueBack() {

    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public Iterator<E> iterator() {
        public boolean hasNext() {
            return 
        }

        public E next() {
            E v = list.getValue();
            list = list.getNext();
            return v;
        }
    }


    public static void main(String[] args) { 

        // ...
    }
}