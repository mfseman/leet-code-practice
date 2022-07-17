package com.company.src.string;

public class ReverseWord {

    public String reverseWord(String word) {
        if (word == null) return null;

        String wordToReverse = word.toLowerCase();
        char[] wordToCharArray = wordToReverse.toCharArray();

        StringBuilder result = new StringBuilder();
        for (int i = wordToCharArray.length - 1; i >= 0; i--) {
            result.append(wordToCharArray[i]);
        }
        return result.toString().replaceAll(" ", "");
    }
}
