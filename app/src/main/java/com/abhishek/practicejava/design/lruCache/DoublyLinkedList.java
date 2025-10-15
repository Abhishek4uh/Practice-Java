package com.abhishek.practicejava.design.lruCache;

public class DoublyLinkedList<K, V>{
    private Node<K,V> head,tail;

    DoublyLinkedList() {
        head = new Node<>(null, null);
        tail = new Node<>(null, null);
        head.next = tail;
        tail.prev = head;
    }

    void addToFront(Node<K, V> node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    void moveToFront(Node<K, V> node) {
        remove(node);
        addToFront(node);
    }

    void remove(Node<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    Node<K, V> removeTail() {
        Node<K, V> lru = tail.prev;
        remove(lru);
        return lru;
    }
}
