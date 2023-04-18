package Json;

import java.util.HashMap;

public class WordCategory {
    private HashMap<String, Word> map;

    public WordCategory() {
    }

    public HashMap<String, Word> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Word> map) {
        this.map = map;
    }
}
