package com.example;


class Node<T> {
    private Node<T> start;
    public Node<T> getStart() {
        return start;
    }

    public void setStart(Node<T> start) {
        this.start = start;
    }

    private Node<T> end;
    public Node<T> getEnd() {
        return end;
    }

    public void setEnd(Node<T> end) {
        this.end = end;
    }

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node(T value){
        this.value = value;
        start = null;
        end = null;
    }

    @Override
    public String toString(){
        return "Node ( " + value + " )";
    }

}
