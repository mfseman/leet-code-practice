package com.company.src.string;

public class MultiplicationTable {

    // Dynatrace Interview Question 1 - Create a multiplication table
    public static void main(String[] args) {
        int maxValue = 12;
        int spaces = String.valueOf(maxValue * maxValue).length() + 1;
        for (int i = 0; i <= maxValue; i++) {
            for (int j = 0; j <= maxValue; j++) {
                if (i == 0) {
                    System.out.format("%" + spaces + "d", j);
                } else if (j == 0) {
                    System.out.format("%" + spaces + "d", i);
                } else {
                    System.out.format("%" + spaces + "d", j * i);
                }
            }
            System.out.println();
        }
    }
}
