package dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;

public class Dao {
    ObjectMapper mapper = new ObjectMapper();

    public HashMap<String, Object> getWordMap() throws URISyntaxException, IOException {
        File file = getDataFile();

        return mapper.readValue(file, new TypeReference<>(){});
    }

    private File getDataFile() throws URISyntaxException {
        URL url = getUrl();
        URI uri = url.toURI();

        return new File(uri);
    }

    private URL getUrl() {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResource("data.json");
    }

}
