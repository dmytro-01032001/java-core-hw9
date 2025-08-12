package com.example;

public class App 
{
    private static void testMyArrayList(){
        System.out.println("Initialize MyArrayList with normal array");
        Integer[] a = {1,2};
        MyArrayList<Integer> list = new MyArrayList<>(a);
        System.out.println( list);
        System.out.println("Initialize MyArrayList with nothing");
        list = new MyArrayList<>();
        System.out.println( list);
        System.out.println("addint null to the previous MyArrayList variable");
        list.add(null);
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        System.out.println("Removing second element from the MyArrayList variable");
        list.remove(1);
        System.out.println(list);
        System.out.println("Size of MyArrayList variable");
        System.out.println(list.size());
        System.out.println("Second element of MyArrayList array");
        System.out.println(list.get(1));
        System.out.println("Clearing MyArrayList array");
        list.clear();
        System.out.println(list);
    }

    private static void testMyLinkedList(){
        MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(1);
        System.out.println(list);
        System.out.println(list.size());
        list.add(2);
        System.out.println(list);
        System.out.println(list.size());
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());  // 3

        System.out.println("\ntest get");
        System.out.println(list.get(1));  // Node ( 2 )

        System.out.println("\ntest remove");
        list.remove(1);
        System.out.println(list);  // [ 1, 3 ]
        System.out.println(list.size());  // 2

        System.out.println("\ntest clear");
        list.clear();
        System.out.println(list);  // [ ]
        System.out.println(list.size());  // 0
    }

    private static void testMyQueue(){
        MyQueue<Integer> q = new MyQueue();
        System.out.println(q);
        System.out.println(q.size());

        q.add(1);
        System.out.println(q);
        System.out.println(q.size());

        q.add(2);
        System.out.println(q);
        System.out.println(q.size());

        q.add(3);
        System.out.println(q);
        System.out.println(q.size());

        System.out.println("\npeek");
        System.out.println(q.peek());
        System.out.println(q);

        System.out.println("\npoll");
        System.out.println(q.poll());
        System.out.println(q);

        System.out.println("\nclear");
        q.clear();
        System.out.println(q);
    }

    private static void testMyStack(){
        MyStack<Integer> q = new MyStack();
        System.out.println(q);
        System.out.println(q.size());

        q.push(1);
        System.out.println(q);
        System.out.println(q.size());

        q.push(2);
        System.out.println(q);
        System.out.println(q.size());

        q.push(3);
        System.out.println(q);
        System.out.println(q.size());

        System.out.println("\npeek");
        System.out.println(q.peek());
        System.out.println(q);

        System.out.println("\npop");
        System.out.println(q.pop());
        System.out.println(q);

        System.out.println("\nclear");
        q.clear();
        System.out.println(q);
    }

    private static void testMyHashMap(){
        MyHashMap h = new MyHashMap();
        System.out.println(h);
        System.out.println(h.size());

        h.put(1, "one");
        System.out.println(h);
        System.out.println(h.size());

        h.put(2, "two");
        System.out.println(h);
        System.out.println(h.size());

        h.put(3, "three");
        System.out.println(h);
        System.out.println(h.size());

        System.out.println("\nremove");
        h.remove(2);
        System.out.println(h);

        System.out.println("\nclear");
        h.clear();
        System.out.println(h);
    }

    public static void main( String[] args )
    {
        // testMyArrayList();
        // testMyLinkedList();
        // testMyQueue();
        // testMyStack();
        testMyHashMap();
    }
}
