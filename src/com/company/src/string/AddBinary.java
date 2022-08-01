package com.company.src.string;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1; // i is the pointer of "a" string
        int j = b.length() - 1; // j is the pointer of "b" string
        int c = 0; // that we "carry" after addition

        while (i >= 0 || j >= 0 || c > 0) {
            if (i >= 0) c += a.charAt(i) - '0'; // to get the value like 1 - 0 = 1 & 0 - 0 = 0
            if (j >= 0) c += b.charAt(j) - '0';
            sb.append((char) (c % 2 + '0'));
            c /= 2;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
