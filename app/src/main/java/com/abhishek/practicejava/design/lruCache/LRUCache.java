package com.abhishek.practicejava.design.lruCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K,V> {
    private final int capacity;
    private final Map<K,Node<K,V>> map;
    private final DoublyLinkedList<K,V> dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.dll = new DoublyLinkedList<>();
    }

    public V get(K key) {
        if (!map.containsKey(key)) {
            return null;
        }
        Node<K,V> node = map.get(key);
        dll.moveToFront(node); //Mark as recently used
        return node.value;
    }

    public void put(K key, V value) {
        if (map.containsKey(key)) {
            Node<K,V> node = map.get(key);
            node.value = value;
            dll.moveToFront(node);
        }
        else {
            if (map.size() == capacity) {
                Node<K,V>  lru = dll.removeTail();   //Evict LRU
                map.remove(lru.key);
            }
            Node<K,V> newNode = new Node<K,V> (key, value);
            dll.addToFront(newNode);
            map.put(key, newNode);
        }
    }
}
