package dao;

import Json.GetJson;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Parser {
    Dao dao = new Dao();

    public void getJson() throws IOException, URISyntaxException {
        ObjectMapper objectMapper = new ObjectMapper();
        GetJson list = objectMapper.readValue(dao.getUrl(), GetJson.class);
//        System.out.println(list.getData());

    }
}
