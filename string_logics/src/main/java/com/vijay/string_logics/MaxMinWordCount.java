package com.vijay.string_logics;

public class MaxMinWordCount {

    public static void main(String[] args) {
        String str = "i am an android developer";
        String current_word = "", largest = "";
        String word_count[] = str.split(" ");
        for (int i = 0; i < word_count.length; i++) {
            current_word = word_count[i];
            if (current_word.length() > word_count.length) {
                largest=current_word;
            }
        }
        System.out.println(largest);
    }

}