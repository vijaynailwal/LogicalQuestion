package com.vijay.string_logics;

public class CountSpaceString {
    public static void main(String[] args) {
        String str = "i am an android developer";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
