package com.example;

class MyArrayList<T>{
    private T[] myList;

    public MyArrayList(T[] myList){
        this.myList = (T[]) new Object[myList.length];
        System.arraycopy(myList, 0, this.myList, 0, myList.length);
    }
    public MyArrayList(){

    }

    @Override
    public String toString(){
        if(myList == null){
            return "null";
        }
        if(myList.length == 0 ){
            return "[ ]";
        }
        String text = "[ " + myList[0];
        for(int i=1;i<myList.length;i++){
            text = text + ", " + myList[i];
        }
        return text + " ]";
    }

    public void add(T value){
        if(myList == null){
            myList = (T[]) new Object[1];
            myList[0] = value;
            return;
        }
        T[] temp = (T[]) new Object[myList.length + 1];
        System.arraycopy(myList, 0, temp, 0, myList.length);
        temp[myList.length] = value;
        myList = temp;
    }

    public void remove(int index){
        if(index > (myList.length-1) || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if(myList == null || myList.length == 0){
            return;
        }
        if(myList.length == 1){
            myList = (T[]) new Object[0];
            return;
        }
        T[] temp = (T[]) new Object[myList.length - 1];
        System.arraycopy(myList, 0, temp, 0, index);
        System.arraycopy(myList, index+1, temp, index, myList.length - index - 1);
        myList = temp;
    }

    public void clear(){
        myList = (T[]) new Object[0];
    }

    public int size(){
        return myList.length;
    }

    public T get(int index){
        if(index > (myList.length-1) || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return myList[index];
    }
}
