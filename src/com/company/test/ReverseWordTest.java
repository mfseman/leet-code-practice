package com.company.test;

import com.company.src.string.AddBinary;
import com.company.src.string.ReverseWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordTest {

    @Test
    public void reverseWordWithWhiteSpaces() {
        ReverseWord reverseWord = new ReverseWord();

        String result = reverseWord.reverseWord("Banana Apple Orange");

        assertEquals("egnaroelppaananab", result);
    }

    @Test
    public void addBinary() {
        AddBinary addBinary = new AddBinary();

        String result = addBinary.addBinary("111", "11");

        assertEquals("01010", result);
    }
}
