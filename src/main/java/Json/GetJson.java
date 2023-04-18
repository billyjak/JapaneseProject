package Json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dao.Dao;

import java.io.IOException;
import java.net.URISyntaxException;

public class GetJson {

   public void getValueFromJson() throws IOException, URISyntaxException {
       Dao dao = new Dao();
       ObjectMapper objectMapper = new ObjectMapper();
       WordCategory wordCategory = objectMapper.readValue(dao.getDataFile(), new TypeReference<>() {});
       Word word = objectMapper.readValue(wordCategory.toString(), new TypeReference<>(){});
       AnswerType answerType = objectMapper.readValue(word.toString(), new TypeReference<>(){});

       System.out.println(answerType);
   }
}