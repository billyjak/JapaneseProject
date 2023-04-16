package dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Dao {
    private final File file = new File("src\\main\\java\\data\\data.json");
    private final ObjectMapper mapper = new ObjectMapper();
    private final Map<String, Object> wordMap;

    {
        try {
            wordMap = mapper.readValue(file, new TypeReference<>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public Map<String, Object> getWordMap() {
        return wordMap;
    }

}
