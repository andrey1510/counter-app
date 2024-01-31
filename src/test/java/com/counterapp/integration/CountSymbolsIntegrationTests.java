package com.counterapp.integration;

import com.counterapp.testData.TestData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CountSymbolsIntegrationTests extends TestData {

    @LocalServerPort
    private int port;

    private final String uri = "/api/v1/symbols-counter";

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void regularStringTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(regularStringInput, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "http://localhost:" + port + uri,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(regularStringExpected, responseEntity.getBody());
    }

    @Test
    void symbolsStringTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(symbolsStringInput, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "http://localhost:" + port + uri,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(symbolsStringExpected, responseEntity.getBody());
    }

    @Test
    void whitespaceStringTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(whitespaceStringInput, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "http://localhost:" + port + uri,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(whitespaceStringExpected, responseEntity.getBody());
    }

    @Test
    void linebreakStringTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(linebreakStringInput, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "http://localhost:" + port + uri,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(linebreakStringExpected, responseEntity.getBody());
    }

    @Test
    void longMultilangStringTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(longMultilangStringInput, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "http://localhost:" + port + uri,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(longMultilangStringExpected, responseEntity.getBody());
    }

    @Test
    void emptyStringTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(emptyStringInput, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "http://localhost:" + port + uri,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }

    @Test
    void noStringTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "http://localhost:" + port + uri,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }

}