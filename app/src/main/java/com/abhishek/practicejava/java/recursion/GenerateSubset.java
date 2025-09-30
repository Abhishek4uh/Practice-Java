package com.abhishek.practicejava.java.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubset {

    public void generateSubsets(String res, String str){

        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        char ch = str.charAt(0);
        generateSubsets(res + ch, str.substring(1));
        generateSubsets(res, str.substring(1));
    }

    public List<String> subsets(String res, String str){
        if (str.isEmpty()) {
            ArrayList<String> baseResult = new ArrayList<>();
            if (!res.isEmpty()) {
                baseResult.add(res);
            }
            return baseResult;
        }
        char ch = str.charAt(0);
        List<String> left = subsets(res + ch, str.substring(1));
        List<String> right = subsets(res, str.substring(1));
        left.addAll(right);
        return left;
    }
}
