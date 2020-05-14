package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


import javax.annotation.processing.Processor;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String someTekst = "Tekst do przerobienia.";

        poemBeautifier.beautify(someTekst, thisTekst -> "ABC"+thisTekst+"ABC");
        poemBeautifier.beautify(someTekst, thisTekst -> thisTekst.toUpperCase());
        poemBeautifier.beautify(someTekst, thisTekst -> thisTekst.replace('.', '?'));
        poemBeautifier.beautify(someTekst, thisTekst -> thisTekst.substring(5).trim());
    }
}
