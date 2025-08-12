package com.example;


public class MyLinkedList<T> extends BaseLinkedList<T>{
    public void remove(int index){
        protectedRemove(index);
    }

    public Node<T> get(int index){
        if(index > (size()-1) || index < 0){
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node<T> currNode = first;
        while(counter != index){
            counter++;
            currNode = currNode.getEnd();
        }
        return currNode;
    }
}
