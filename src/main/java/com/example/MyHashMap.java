package com.example;



public class MyHashMap {
    private static class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node node;

    public void put(Object key, Object value){
        Node current = node;
        Node previous = null;
        while(current != null){
            if(current.key.equals(key)){
                current.value = value;
                return;
            }
            previous = current;
            current = current.next;
        }
        Node next = new Node(key, value);
        if(previous == null){
            node = next;
        } else {
            previous.next = next;
        }
    }
    
    public void remove(Object key){
        Node current = node;
        Node previous = null;
        while(current != null){
            if (current.key.equals(key)) {
                if (previous == null) {
                    node = node.next;  // remove first node
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void clear() {
        node = null;
    }

    public int size() {
        int size = 0;
        Node current = node;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public Object get(Object key){
        Node current = node;
        while(current != null){
            if(current.key.equals(key)){
                return current.value;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        if(node == null){
            return "[ ]";
        }
        String text = "[ {" + node.key + ":" + node.value + "}";
        Node currNode = node.next;
        while(currNode != null){
            text = text + ", {" + currNode.key + ":" + currNode.value + "}";
            currNode = currNode.next;
        }
        return text + " ]";
    }

}
