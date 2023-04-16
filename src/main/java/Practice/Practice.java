package Practice;

import dao.Dao;

import java.util.*;

public class Practice {
    private final Dao DAO = new Dao();
    private final Map<String, Object> wordMap = DAO.getWordMap();
    private final Scanner SCANNER = new Scanner(System.in);
    public void practiceOne() {
        Object[] testDaoKeys = wordMap.keySet().toArray();
        String key = testDaoKeys[new Random().nextInt(testDaoKeys.length)].toString();
        System.out.println("What does " + key + " mean?");
        String answer = SCANNER.nextLine();
        if (answer.equals(wordMap.get(key))) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect! The correct answer is " + wordMap.get(key));
        }

    }
    public void practiceAmount(int amount) {
        if (wordMap.size() < amount) {
            amount = wordMap.size();
        }
        Object[] keys = wordMap.keySet().toArray();
        List<String> wordList =
                new ArrayList<>(Arrays.stream(Arrays.stream(keys)
                                .toArray(String[]::new))
                                .toList());
//        Set<String> wordList = new HashSet<>(Arrays.stream(Arrays.stream(keys)
//                        .toArray(String[]::new))
//                        .toList());
        for (int i = 0; i < amount; i++) {
            int index = new Random().nextInt(wordList.size());
            String englishWord = wordList.get(index);
            String japaneseWord = wordMap.get(englishWord).toString();
            System.out.println("What is the Japanese word for " + englishWord + " ?");
            String answer = SCANNER.nextLine();
            if (answer.equals(japaneseWord)) {
                System.out.println("Correct.");
            } else {
                System.out.println("Incorrect. The answer is " + japaneseWord + ".");
            }
            wordList.remove(index);
        }
    }
}
