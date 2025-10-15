package com.abhishek.practicejava.java.tree.nArrayTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NArrayTree<T>{
    NArrayTreeNode<T> root;

    public NArrayTree(){
        root = null;
    }

    public ArrayList<T> levelOrderTraversal(NArrayTreeNode<T> root) {
        ArrayList<T> res = new ArrayList<>();
        if (root == null) return res;

        Queue<NArrayTreeNode<T>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            NArrayTreeNode<T> node = queue.poll();
            if (node != null){
                res.add(node.data);
                for (NArrayTreeNode<T> child : node.children){
                    queue.offer(child);
                }
            }
        }
        return res;
    }
}
