package com.example;

public class MyStack<T> extends BaseLinkedList<T> {
    public void push(T value){
        add(value);
    }

    public void remove(int index){
        protectedRemove(index);
    }

    public Node<T> peek(){
        // last-in-first-out
        return last;
    }

    public Node<T> pop(){
        // last-in-first-out
        Node<T> result = last;
        protectedRemove(size() - 1);
        return result;
    }
}
