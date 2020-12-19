package com.vijay.string_logics;

public class ReverseString {
    public static void main(String[] args) {
        String str="i am an android developer";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder=stringBuilder.append(str);
        stringBuilder=stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
