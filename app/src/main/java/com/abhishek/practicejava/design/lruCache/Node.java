package com.abhishek.practicejava.design.lruCache;

public class Node<K, V> {
    K key;
    V value;
    Node<K, V> prev, next;

    Node(K k, V v) {
        key = k;
        value = v;
    }
}