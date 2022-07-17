package com.company.src.string;

public class RomanToInteger {
    public int romanToInt(String s) {
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            // for 'I' and if 'IV' or 'IX'
            if (s.charAt(i) == 'I') {
                if (i != s.length() - 1 && s.charAt(i + 1) == 'V') {
                    count += 4;
                    i++;
                } else if (i != s.length() - 1 && s.charAt(i + 1) == 'X') {
                    count += 9;
                    i++;
                } else {
                    count += 1;
                }
            }
            // for 'V'
            else if (s.charAt(i) == 'V') {
                count += 5;
            }
            // for 'X' if 'XL' or 'XC'
            else if (s.charAt(i) == 'X') {
                if (i != s.length() - 1 && s.charAt(i + 1) == 'L') {
                    count += 40;
                    i++;
                } else if (i != s.length() - 1 && s.charAt(i + 1) == 'C') {
                    count += 90;
                    i++;
                } else {
                    count += 10;
                }
            }
            // for 'L'
            else if (s.charAt(i) == 'L') {
                count += 50;
            }
            // for 'C' if 'CD' or 'CM'
            else if (s.charAt(i) == 'C') {
                if (i != s.length() - 1 && s.charAt(i + 1) == 'D') {
                    count += 400;
                    i++;
                } else if (i != s.length() - 1 && s.charAt(i + 1) == 'M') {
                    count += 900;
                    i++;
                } else {
                    count += 100;
                }
            }
            // for 'D'
            else if (s.charAt(i) == 'D') {
                count += 500;
            }
            // for 'M'
            else if (s.charAt(i) == 'M') {
                count += 1000;
            }

            i++;
        }
        return count;
    }
}
