package com.example;

public class MyQueue<T> extends BaseLinkedList<T> {
    public Node<T> peek(){
        return first;
    }
    public Node<T> poll(){
        if(first == null){return null;}
        Node<T> result;
        result = first;
        if(first.getEnd() == null){
            first = null;
        } else {
            first = first.getEnd();
        }
        return result;
    }
}
