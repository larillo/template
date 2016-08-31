package ar.fiuba.tdd.template;

import java.util.NoSuchElementException;

public class SLList<T> {

    private static class Node<T> {
        private T element;
        private Node<T> next;

        public Node(T ele, Node<T> nxt) {
            element = ele;
            next = nxt;
        }

        public T getElement( ) {
            return element;
        }

        public Node<T> getNext( ) {
            return next;
        }

        public void setNext(Node<T> nxt) {
            next = nxt;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public SLList( ) { }

    public int size( ) {
        return size;
    }

    public boolean isEmpty( ) {
        return size == 0;
    }

    public T first( ) {
        if (isEmpty( )) {
            throw new NoSuchElementException("Queue underflow");
        }
        return head.getElement( );
    }

    public void addLast(T ele) {
        Node<T> newest = new Node<>(ele, null);
        if (isEmpty( )) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public void removeFirst( ) {
        if (isEmpty( )) {
            throw new NoSuchElementException("Queue underflow");
        }
        head = head.getNext( );
        size--;
        if (size == 0) {
            tail = null;
        }
    }
}
