package practice;

import dao.Dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Practice {
    private final Scanner scanner = new Scanner(System.in);
    private final HashMap<String, Object> wordMap;
    private final List<String> testDaoKeys;
    private final Set<Integer> integerSet;

    public Practice() throws URISyntaxException, IOException {
        Dao dao = new Dao();
        this.wordMap = dao.getWordMap();
        this.testDaoKeys = wordMap.keySet().stream().toList();
        this.integerSet = new HashSet<>();
    }

    public void practiceOneQuestion() {
        String key = getKeyForQuestion();
        askQuestion(key);
        evaluateAnswer(key);
    }

    public void practiceNQuestions(int suggestedNumQuestions) {
        int numQuestions = Math.min(suggestedNumQuestions, wordMap.size());
        for (int i = 0; i < numQuestions; i++) {
            practiceOneQuestion();
        }
    }

    private String getKeyForQuestion() {
        int numWords = testDaoKeys.size();
        int random = new Random().nextInt(numWords);

        while (!integerSet.add(random)) {
            random = new Random().nextInt(numWords);
        }

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
