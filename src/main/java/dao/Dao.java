package dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class Dao {
    HashMap<String, Object> wordMap = new HashMap<>();
    ClassLoader classLoader = getClass().getClassLoader();
    File file = (new File(Objects.requireNonNull(Objects.requireNonNull(classLoader.getResource("data.json")).getFile())));
    ObjectMapper mapper = new ObjectMapper();

    public HashMap<String, Object> getWordMap() {
        try {
            wordMap = mapper.readValue(file, new TypeReference<>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wordMap;
    }

}
