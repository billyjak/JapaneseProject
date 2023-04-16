package org.example;

import Practice.Practice;
import Practice.TestPractice;
import dao.Dao;
import dao.TestDao;

import java.io.IOException;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Dao dao = new Dao();
        Practice practice = new Practice();
        practice.practiceAmount(50);
    }
}
