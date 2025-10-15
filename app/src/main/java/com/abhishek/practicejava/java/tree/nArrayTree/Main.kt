package com.abhishek.practicejava.java.tree.nArrayTree

fun main() {

    /**
         1
      /  |  \
     2   3   4
    /    \
    6     5

     **/

    val root = NArrayTreeNode(1)
    val child1 = NArrayTreeNode(2)
    val child2 = NArrayTreeNode(3)
    val child3 = NArrayTreeNode(4)

    val grandChild1 = NArrayTreeNode(5)
    val grandChild2 = NArrayTreeNode(6)

    child1.children.add(grandChild2)
    child2.children.add(grandChild1)

    root.children.add(child1)
    root.children.add(child2)
    root.children.add(child3)

    val tree = NArrayTree<Int>()
    tree.root = root

    val result = tree.levelOrderTraversal(tree.root)
    println("Level Order Traversal: $result")
}
