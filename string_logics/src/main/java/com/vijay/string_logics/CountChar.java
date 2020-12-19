package com.vijay.string_logics;

public class CountChar {


    public static void main(String[] args) {
        String str = "i am an android developer";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println(count++);
    }
}
