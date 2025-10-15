package com.abhishek.practicejava.java.tree.binaryTree

fun main() {
    //Root, Leaf, Ancestor, Descendent, Sibling(Same Parent),

 /**
         5
        / \
       1   8
      /   / \
     4    6  3
**/

    val tree= BinaryTree<Int>()
    tree.root= BinaryTreeNode(5)
    tree.root?.left=BinaryTreeNode(1)
    tree.root?.right=BinaryTreeNode(8)
    tree.root?.left?.left=BinaryTreeNode(4)
    tree.root?.right?.left=BinaryTreeNode(6)
    tree.root?.right?.right=BinaryTreeNode(3)
    val result = tree.levelOrderTraversal(tree.root)

    println("Level Order Traversal: $result")

    println("Pre Order Traversal: ${tree.preOrderTraversalRecursive(tree.root, ArrayList())}")
    println("Pre Order Traversal: ${tree.preOrderTraversalIterative(tree.root)}")

    println("In Order Traversal: ${tree.inOrderTraversalRecursive(tree.root, ArrayList())}")

    println("Post Order Traversal: ${tree.postOrderTraversal(tree.root, ArrayList())}")

    println("Height of Tree: ${tree.maxDepthOrHeightOfBinaryTreeIterative(tree.root)}")
    println("Height of Tree: ${tree.maxDepthOrHeightOfBinaryTreeRecursive(tree.root)}")

}