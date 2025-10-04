package com.abhishek.practicejava.java.hashmap;

import java.util.LinkedList;
import java.util.Objects;

public class CustomHashmap<K, V> {
    class Node{
        K key;
        V value;

        Node(K key, V value){
            this.key = key;
            this.value = value;
        }


        @Override
        public String toString() {
            return key+"="+value;
        }
    }

    private LinkedList<Node> hashTable[];
    private int element;
    private int tableSize;
    private double loadFactor;

     CustomHashmap(){
       element=0;
       tableSize=16;
       loadFactor=0.75;
       hashTable = new LinkedList[tableSize];
       initializedHashTable();
    }

    private void initializedHashTable(){
        for(int i=0;i<tableSize;i++){
            hashTable[i] = new LinkedList<>();
        }
    }
    private int getHashCode(K key){
        int hash = Objects.hash(key);
        return Math.abs(hash)%tableSize;
    }

    private int searchKeyInHashTable(int hash,K key){
        LinkedList<Node> list = hashTable[hash];
        for(int i=0;i<list.size();i++){
            if(list.get(i).key.equals(key)){
                return i;
            }
        }
        return -1;
    }

    private void reHashing(){
        LinkedList<Node> oldHashTable[] = hashTable;
        tableSize = tableSize*2;
        element=0;
        hashTable= new LinkedList[tableSize];
        initializedHashTable();
        for(LinkedList<Node> list: oldHashTable){
            for(Node node: list){
                put(node.key, node.value);
            }
        }
    }

    public void put(K key, V value){
        //Find HashCode for Key
        int hash = getHashCode(key);
        int index = searchKeyInHashTable(hash, key);
        Node node = new Node(key, value);
        if(index==-1){
            //Insert at the Head of The LinkedList
            hashTable[hash].add(0, node);
            element++;
        }
        else{
            //Update the Value
            hashTable[hash].get(index).value = value;
        }
        if (((double) element / tableSize) > loadFactor) {
            reHashing();
        }
    }

    public V get(K key){
        int hash = getHashCode(key);
        int index = searchKeyInHashTable(hash, key);
        if(index==-1){
            return null;
        }
        return hashTable[hash].get(index).value;
    }

    public boolean containsKey(K key) {
        int hash = getHashCode(key);
        int index = searchKeyInHashTable(hash, key);
        if(index == -1) {
            return false;
        }
        return true;
    }

    public boolean containsValue(V value) {
        for(int i=0;i<tableSize;i++) {
            for(Node node: hashTable[i]) {
                if(node.value.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public V remove(K key) {
        int hash = getHashCode(key);
        int index = searchKeyInHashTable(hash, key);
        if(index == -1) {
            return null;
        }
        else{
            V value = hashTable[hash].get(index).value;
            hashTable[hash].remove(index);
            element--;
            return value;
        }
    }

    public void iterator(){
        for(int i=0;i<tableSize;i++){
            for(Node node: hashTable[i]){
                System.out.println(node);
            }
        }
    }

    public boolean isEmpty(){
        return element==0;
    }

    public int size(){
        return element;
    }
}














