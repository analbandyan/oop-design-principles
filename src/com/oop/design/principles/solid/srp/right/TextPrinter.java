package com.oop.design.principles.solid.srp.right;

import java.util.Arrays;

public class TextPrinter {

    private String text;

    public TextPrinter(String text) {
        this.text = text;
    }

    public void printText() {
        System.out.println(text);
    }

    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(text.split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(text.substring(startingIndex, endIndex));
    }

}
