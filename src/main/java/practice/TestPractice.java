package practice;

import dao.TestDao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestPractice {
    private final TestDao testDao = new TestDao();
    private final HashMap<String, Object> testMap = testDao.getTestMap();
    private final Scanner scanner = new Scanner(System.in);

    public TestPractice() throws IOException, URISyntaxException {
    }

    public void practiceOneQuestion() {
        String key = getKeyForQuestion();
        askQuestion(key);
        evaluateAnswer(key);
    }

    private static void askQuestion(String key) {
        System.out.println("What is the Japanese word for " + key + "?");
    }

    private void evaluateAnswer(String key) {
        String givenAnswer = scanner.nextLine();
        String correctAnswer = testMap.get(key).toString();

        System.out.println(givenAnswer.equals(correctAnswer) ?
                "Correct." :
                "Incorrect. The answer is " + correctAnswer + ".");
    }

    private String getKeyForQuestion() {
        List<String> testDaoKeys = testMap.keySet().stream().toList();
        return testDaoKeys.get(new Random().nextInt(testDaoKeys.size()));
    }
}
