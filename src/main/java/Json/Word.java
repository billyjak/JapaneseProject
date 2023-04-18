package Json;

import java.util.HashMap;

public class Word {
    private HashMap<String, AnswerType> map;

    public Word() {
    }

    public HashMap<String, AnswerType> getMap() {
        return map;
    }

    public void setMap(HashMap<String, AnswerType> map) {
        this.map = map;
    }
}
