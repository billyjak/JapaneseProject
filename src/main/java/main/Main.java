package main;

import Json.GetJson;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        GetJson getJson = new GetJson();
        getJson.getValueFromJson();
    }
}
