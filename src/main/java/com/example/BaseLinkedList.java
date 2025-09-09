package com.example;

public class BaseLinkedList<T> {
    protected Node<T> first;
    protected Node<T> last;

    public void add(T value){
        if(first == null){
            first = new Node<>(value);
            return;
        }
        if(last == null){
            last = new Node<>(value);
            first.setEnd(last);
            last.setStart(first);
            return;
        }
        Node<T> newLast = new Node<>(value);
        last.setEnd(newLast);
        newLast.setStart(last);
        last = newLast;
    }

    @Override
    public String toString(){
        if(first == null){
            return "[ ]";
        }
        String text = "[ " + first.getValue();
        Node<T> currNode = first.getEnd();
        while(currNode != null){
            text = text + ", " + currNode.getValue();
            currNode = currNode.getEnd();
        }
        return text + " ]";
    }

    public int size(){
        int s = 0;
        Node<T> currNode = first;
        while(currNode != null){
            s++;
            currNode = currNode.getEnd();
        }
        return s;
    }


    protected void protectedRemove(int index){
        if(index > (size()-1) || index < 0){
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node<T> currNode = first;
        do{
            if(counter == index){
                Node<T> s = currNode.getStart();
                Node<T> e = currNode.getEnd();
                if(s == null){
                    e.setStart(null);
                    first = e;
                    return;
                }
                if(e == null){
                    s.setEnd(null);
                    last = s;
                    return;
                }
                s.setEnd(e);
                e.setStart(s);
            }
            counter++;
            currNode = currNode.getEnd();
        } while(counter <= index);
    }

    public void clear(){
        last = null;
        first = null;
    }

}
