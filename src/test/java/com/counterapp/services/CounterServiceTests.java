package com.counterapp.services;

import com.counterapp.testData.TestData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterServiceTests extends TestData {

    CounterServiceImpl counterServiceImpl = new CounterServiceImpl();

    @Test
    void regularStringTest(){
        assertEquals(regularStringExpected, counterServiceImpl.countSymbols(regularStringInput));
    }

    @Test
    void symbolsStringTest(){
        assertEquals(symbolsStringExpected, counterServiceImpl.countSymbols(symbolsStringInput));
    }

    @Test
    void whitespaceStringTest(){
        assertEquals(whitespaceStringExpected, counterServiceImpl.countSymbols(whitespaceStringInput));
    }


    @Test
    void linebreakStringTest(){
        assertEquals(linebreakStringExpected, counterServiceImpl.countSymbols(linebreakStringInput));
    }

    @Test
    void longMultilangStringTest(){
        assertEquals(longMultilangStringExpected, counterServiceImpl.countSymbols(longMultilangStringInput));
    }

}
