package org.example;

import practice.Practice;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Practice practice = new Practice();
        practice.practiceNQuestions(3);
    }
}
