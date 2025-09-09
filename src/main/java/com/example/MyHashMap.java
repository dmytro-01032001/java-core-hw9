package com.example;



public class MyHashMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Node[] lists;
    private int size;
    private static final int CAPACITY = 16;

    MyHashMap() {
        this.lists = new Node[CAPACITY];
        this.size = 0;
    }

    private int hash(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode()) % lists.length;
    }

    public void put(K key, V value){
        int index = hash(key);
        Node<K, V> current = lists[index];
        while(current != null){
            if(current.key.equals(key)){
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node<K, V> newNode = new Node<>(key, value, lists[index]);
        lists[index] = newNode;
        size++;
    }
    
    public void remove(K key){
        int index = hash(key);
        Node<K, V> current = lists[index];
        Node<K, V> previous = null;
        while(current != null){
            if (current.key.equals(key)) {
                if (previous == null) {
                    lists[index] = current.next;  // remove first node
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void clear() {
        for (int i = 0; i < lists.length; i++) {
            lists[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key){
        int index = hash(key);
        Node<K, V> current = lists[index];
        while(current != null){
            if(current.key.equals(key)){
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public String toString(){
        String text = "[ ";
        for (int i = 0; i < lists.length; i++) {
            Node<K, V> currNode = lists[i];
            if(currNode == null){
                text = text + "[]";
                continue;
            }
            String iText = "[{";
            iText = iText  + currNode.key + ":" + currNode.value + "}";
            currNode = currNode.next;
            while(currNode != null){
                iText = iText + ", {" + currNode.key + ":" + currNode.value + "}";
                currNode = currNode.next;
            }
            text = text + iText + "],";
        }
        return text + " ]";
    }

}
