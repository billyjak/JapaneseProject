package practice;

import dao.Dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    private final Scanner scanner = new Scanner(System.in);
    private final HashMap<String, Object> wordMap;
    private final List<String> testDaoKeys;

    public Practice() throws URISyntaxException, IOException {
        Dao dao = new Dao();
        this.wordMap = dao.getWordMap();
        this.testDaoKeys = wordMap.keySet().stream().toList();
    }

    public void jacksonFunc() throws IOException {
    }

    public void practiceNQuestions(int suggestedNumQuestions) {
        int numQuestions = Math.min(suggestedNumQuestions, wordMap.size());
        for (Integer integer : getRandomNumbersForKeys(numQuestions)) {
            practiceSelectedQuestion(integer);
        }
    }

    private ArrayList<Integer> getRandomNumbersForKeys(int numQuestions) {
        ArrayList<Integer> arrayList = new ArrayList<>(numQuestions);
        Collections.shuffle(arrayList);
        return arrayList;
    }

    private void practiceSelectedQuestion(Integer integer) {
        String key = testDaoKeys.get(integer);
        askQuestion(key);
        evaluateAnswer(key);
    }

    public void practiceOneQuestion() {
        String key = getKeyForQuestion();
        askQuestion(key);
        evaluateAnswer(key);
    }

    private String getKeyForQuestion() {
        int numWords = testDaoKeys.size();
        int random = new Random().nextInt(numWords);
        return testDaoKeys.get(random);
    }

    private static void askQuestion(String key) {
        System.out.println("What is the Japanese word for " + key + "?");
    }

    private void evaluateAnswer(String key) {
        String givenAnswer = scanner.nextLine();
        String correctAnswer = wordMap.get(key).toString();

        System.out.println(givenAnswer.equals(correctAnswer) ?
                "Correct." :
                "Incorrect. The answer is " + correctAnswer + ".");
    }
}
