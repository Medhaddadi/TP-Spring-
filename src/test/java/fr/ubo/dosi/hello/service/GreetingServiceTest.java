package fr.ubo.dosi.hello.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.ubo.dosi.hello.bean.Greeting;
import org.junit.jupiter.api.Test;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.HttpResponse;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {


    @Test
    public void badGreeting() throws Exception {
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet mockRequest = new HttpGet("http://localhost:8080/ArchiJEEWSRestTP_war_exploded/greeting");
        mockRequest.addHeader("http-user", "toto");
        HttpResponse mockResponse = client.execute(mockRequest);

        BufferedReader rd = new BufferedReader(new InputStreamReader(mockResponse.getEntity().getContent()));

        StringBuilder responseBuilder = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            responseBuilder.append(line);
        }
        String jsonResponse = responseBuilder.toString();

        ObjectMapper mapper = new ObjectMapper();

        Greeting responseGreeting = mapper.readValue(jsonResponse, Greeting.class);

        assertEquals(200, mockResponse.getStatusLine().getStatusCode());
        assertTrue(responseGreeting.getMessage().contains("name est obligatoire . Merci de renseigner ce champ"));
    }

}