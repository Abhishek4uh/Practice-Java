package com.abhishek.practicejava.java.recursion;

import java.util.List;

public class SortAnArrayWithRecursion {

    private static void insert(List<Integer> a, int k) {
        int n = a.size();
        //Base case
        if (n == 0 || a.get(n - 1) <= k) {
            a.add(k);
            return;
        }
        //remove last and store it
        int val = a.remove(n - 1);
        //insert k in correct position
        insert(a, k);
        //put the last value back
        a.add(val);
    }

    public static void sort(List<Integer> a) {
        int n = a.size();
        if (n <= 1) return;
        //remove last value
        int t = a.remove(n - 1);
        //sort the rest
        sort(a);
        //insert the last value in correct position
        insert(a, t);
    }
}



