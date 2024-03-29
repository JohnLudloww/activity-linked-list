package com.example.linkedlist;


import java.util.StringJoiner;

public class singlylinkedList<E> implements LinkedList<E>
{
        private Node head;
        private Node tail;

        public singlylinkedList()
        {
            head = null;
            tail = null;
        }

    @Override
    public String toString() {

            StringBuilder builder = new StringBuilder("[");
            StringJoiner joiner = new StringJoiner(", ");

            Node current = head;
            if (current != null){
                while (current != null){
                    joiner.add(current.element.toString());
                    current = current.next;
                }
            }
            builder.append(joiner);

            builder.append("]");
            return builder.toString();

    }

    @Override
    public void addFirst(E element) {
        Node node = new Node(element, head); // 1 and 2 done
         if (head == null)
         {
             head = node; // 3
             tail = head;
         } else {
             head = node; // 3

         }

    }

    @Override
    public void addLast(E element) {

        Node node = new Node(element, null);
        tail.next = node;
        tail = node;
    }

    @Override
    public E pollFirst() {
            E element;
            if(head == null)
            {
                element = null;
            } else {
                element = head.element;

                if(head == tail)
                {
                    head =null;
                    tail =null;
                }
             else{
            Node next = head.next;
            head.next = null;
            head  = next;
        }
    }
        return element;
    }

    @Override
    public E pollLast() {
        E element;

        if(tail == null)
        {
            element = null;
        } else {

            element = tail.element;
            if(head == tail)
            {
                head = null;
                tail = null;
            } else {
                Node current = head;
                Node previous = head;
                while(current.next != null){
                    previous = current.next;
                    current = current.next;
                }
                tail = previous;
                tail.next = null;

            }
        }

        return element;



    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {
        Node current = head;
        while(current.next != null)
        {
            Node next = current.next;
            current.next = null;
            current = next;
        }
        head = null;
        tail = null;

    }

    @Override
    public boolean contains(E element) {
        boolean contains = false;
        Node current = head;
        while(current != null)
        {
            Node next =  current.next;
            if(current.element == element)
            {
                contains = true;
                break;
            }
            current = next;
        }
        return contains;
    }

    @Override
    public int size() {
        int counter = 0;
        if (head != null)
        {
            if(head == tail){
                counter = 1;
            } else {
                Node current = head;
                while(current != null){
                    counter++;
                    current = current.next;
                }

            }


        }
            return counter;




    }

    private class Node {

      E element;
      Node next;

      public Node(E element, Node next) {
          this.element  = element;
          this.next = next;
      }
    }





}
