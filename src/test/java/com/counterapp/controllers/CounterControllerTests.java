package com.counterapp.controllers;

import com.counterapp.services.CounterServiceImpl;
import com.counterapp.testData.TestData;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CounterController.class)
class CounterControllerTests extends TestData {

    @MockBean
    private CounterServiceImpl counterServiceImpl;

    @Autowired
    private MockMvc mockMvc;

    private final String uri = "/api/v1/symbols-counter";

    @Test
    @SneakyThrows
    void regularStringTest() {
        when(counterServiceImpl.countSymbols(any(String.class)))
                .thenReturn(regularStringExpected);
        RequestBuilder requestBuilder = post(uri)
                .accept(MediaType.APPLICATION_JSON)
                .content(regularStringInput)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
        MockHttpServletResponse response = result.getResponse();
        assertEquals(HttpStatus.OK.value(), response.getStatus());
    }

    @Test
    @SneakyThrows
    void symbolsStringTest() {
        when(counterServiceImpl.countSymbols(any(String.class)))
                .thenReturn(symbolsStringExpected);
        RequestBuilder requestBuilder = post(uri)
                .accept(MediaType.APPLICATION_JSON)
                .content(symbolsStringInput)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
        MockHttpServletResponse response = result.getResponse();
        assertEquals(HttpStatus.OK.value(), response.getStatus());
    }

    @Test
    @SneakyThrows
    void whitespaceStringTest() {
        when(counterServiceImpl.countSymbols(any(String.class)))
                .thenReturn(whitespaceStringExpected);
        RequestBuilder requestBuilder = post(uri)
                .accept(MediaType.APPLICATION_JSON)
                .content(whitespaceStringInput)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
        MockHttpServletResponse response = result.getResponse();
        assertEquals(HttpStatus.OK.value(), response.getStatus());
    }

    @Test
    @SneakyThrows
    void linebreakStringTest() {
        when(counterServiceImpl.countSymbols(any(String.class)))
                .thenReturn(linebreakStringExpected);
        RequestBuilder requestBuilder = post(uri)
                .accept(MediaType.APPLICATION_JSON)
                .content(linebreakStringInput)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
        MockHttpServletResponse response = result.getResponse();
        assertEquals(HttpStatus.OK.value(), response.getStatus());
    }

    @Test
    @SneakyThrows
    void longMultilangStringTest() {
        when(counterServiceImpl.countSymbols(any(String.class)))
                .thenReturn(longMultilangStringExpected);
        RequestBuilder requestBuilder = post(uri)
                .accept(MediaType.APPLICATION_JSON)
                .content(longMultilangStringInput)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
        MockHttpServletResponse response = result.getResponse();
        assertEquals(HttpStatus.OK.value(), response.getStatus());
    }

}
