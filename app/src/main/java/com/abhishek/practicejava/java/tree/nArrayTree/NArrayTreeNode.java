package com.abhishek.practicejava.java.tree.nArrayTree;

import java.util.ArrayList;

public class NArrayTreeNode<T>{
    T data;
    ArrayList<NArrayTreeNode<T>> children;

    public NArrayTreeNode(T data){
        this.data = data;
        this.children = new ArrayList<>();
    }
    public NArrayTreeNode(T data, ArrayList<NArrayTreeNode<T>> children){
        this.data = data;
        this.children = children;
    }
}
