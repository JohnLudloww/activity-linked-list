package com.example.linkedlist;

import java.util.ArrayList;
import java.util.*;
public class SingleDriver {
    public static void main(String[] args){



        LinkedList<String> list = new singlylinkedList<>();
        list.addFirst("first");
        list.addFirst("second");
        list.addFirst("third");
        list.addFirst("fourth");
        list.addFirst("fifth");

        list.addLast("sixth");
        list.addLast("seventh");
        list.addLast("eighth");
        System.out.println(list);

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.pollFirst());
        System.out.println(list);

        System.out.println(list.pollLast());
        System.out.println(list);

        System.out.println(list.size());


        System.out.println(list.contains("fifth"));
        System.out.println(list.contains("Sixth"));
        System.out.println(list.contains("Seventh"));
        System.out.println(list.contains("Eigth"));
        list.clear();
        System.out.println(list);



        List<String> test = new ArrayList<>();
    }


}
