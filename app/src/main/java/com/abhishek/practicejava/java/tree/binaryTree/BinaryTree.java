package com.abhishek.practicejava.java.tree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree<T> {
    BinaryTreeNode<T> root;

    public BinaryTree() {
        root = null;
    }

    /**
     * Breadth first Search Traversal also Known as Level Order Traversal
    **/
    public ArrayList<T> levelOrderTraversal(BinaryTreeNode<T> root){
        ArrayList<T> res = new ArrayList<>();
        if (root == null) return res;

        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            BinaryTreeNode<T> current = queue.poll(); //Retrieve and remove the head of the queue
            if (current != null){
                res.add(current.data);
                //Process Left part
                if (current.left != null) {
                    queue.offer(current.left);
                }
                //Process Right Part
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
        }
        return res;
    }

    public ArrayList<T> preOrderTraversalRecursive(BinaryTreeNode<T> root, ArrayList<T> res){
        if (root == null) return res;
        res.add(root.data);
        preOrderTraversalRecursive(root.left, res);
        preOrderTraversalRecursive(root.right, res);
        return res;
    }

    public ArrayList<T> preOrderTraversalIterative(BinaryTreeNode<T> root){
        ArrayList<T> res = new ArrayList<>();
        if (root == null) return res;
        Stack<BinaryTreeNode<T>> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            BinaryTreeNode<T> current = stack.pop();
            res.add(current.data);
            if (current.right != null){
                stack.push(current.right);
            }
            if (current.left != null){
                stack.push(current.left);
            }
        }
        return res;
    }

    public ArrayList<T> inOrderTraversalRecursive(BinaryTreeNode<T> root, ArrayList<T> res){
        if (root == null) return res;
        inOrderTraversalRecursive(root.left, res);
        res.add(root.data);
        inOrderTraversalRecursive(root.right, res);
        return res;
    }

    public int maxDepthOrHeightOfBinaryTreeIterative(BinaryTreeNode<T> root){
        //Height of Binary Tree
        if (root == null) return 0;
        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            while (levelSize > 0) {
                BinaryTreeNode<T> current = queue.poll();
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
                levelSize--;
            }
            if(!queue.isEmpty()) level++;
        }
        return (level+1);
    }

    public int maxDepthOrHeightOfBinaryTreeRecursive(BinaryTreeNode<T> root){
        if (root == null) return 0;
        int leftHeight  =  maxDepthOrHeightOfBinaryTreeRecursive(root.left);
        int rightHeight = maxDepthOrHeightOfBinaryTreeRecursive(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


    public ArrayList<T> postOrderTraversal(BinaryTreeNode<T> root, ArrayList<T> res){
        if (root == null) return res;
        postOrderTraversal(root.left, res);
        postOrderTraversal(root.right, res);
        res.add(root.data);
        return res;
    }



}
