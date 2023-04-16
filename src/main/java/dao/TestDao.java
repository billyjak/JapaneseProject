package dao;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class TestDao {
    File file = new File("src\\main\\java\\data\\data.json");
    ObjectMapper mapper = new ObjectMapper();

    Map<String, Object> testMap;

    {
        try {
            testMap = mapper.readValue(file, new TypeReference<>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, Object> getTestMap() {
        return testMap;
    }
}
