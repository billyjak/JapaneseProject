package Practice;

import dao.TestDao;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class TestPractice {
    TestDao testDao = new TestDao();
    Map<String, Object> testMap = testDao.getTestMap();
    Scanner scanner = new Scanner(System.in);
    public void practiceOne() {
        Object[] testDaoKeys = testMap.keySet().toArray();
        String key = testDaoKeys[new Random().nextInt(testDaoKeys.length)].toString();
        System.out.println("What does " + key + " mean?");
        String answer = scanner.nextLine();
        if (answer.equals(testMap.get(key))) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect! The correct answer is " + testMap.get(key));
        }
    }
}
