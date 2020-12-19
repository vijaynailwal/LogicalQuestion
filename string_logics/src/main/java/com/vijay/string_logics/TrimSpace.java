package com.vijay.string_logics;

public class TrimSpace {
    public static void main(String[] args) {
        String str = "i am android developer";
        String new_string = "";
        for (int i = 0; i < str.length(); i++) {
            str = str.replaceAll(" ", "");
        }
        System.out.println(str);

    }
}
