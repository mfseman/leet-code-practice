package com.company;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String reverseValue = String.valueOf(x);
        boolean result = false;
        for (int i = 0; i < reverseValue.length(); i++) {
            if (reverseValue.charAt(i) == reverseValue.charAt(reverseValue.length() - 1 - i)) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }
}
