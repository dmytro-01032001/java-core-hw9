package com.example;

class MyArrayList<T>{
    private T[] myList;
    private int capacity = 10;
    private int size = 0;

    public MyArrayList(){
        this.myList = (T[]) new Object[capacity];
    }

    @Override
    public String toString(){
        if(size == 0 ){
            return "[ ]";
        }
        String text = "[ " + myList[0];
        for(int i=1;i<size;i++){
            text = text + ", " + myList[i];
        }
        return text + " ]";
    }

    public void add(T value){
        if(size == capacity){
            capacity = 2 * capacity;
            T[] temp = (T[]) new Object[capacity];
            System.arraycopy(myList, 0, temp, 0, size);
            myList = temp;
        }
        myList[size] = value;
        size++;
    }

    public void remove(int index){
        if(index > (size-1) || index < 0){
            throw new IndexOutOfBoundsException();
        }
        T[] temp = (T[]) new Object[capacity];
        if(size == 1){
            myList = temp;
            size = 0;
            return;
        }
        System.arraycopy(myList, 0, temp, 0, index);
        System.arraycopy(myList, index+1, temp, index, size - index - 1);
        myList = temp;
        size--;
    }

    public void clear(){
        myList = (T[]) new Object[capacity];
        size = 0;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        if(index > (size-1) || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return myList[index];
    }
}
