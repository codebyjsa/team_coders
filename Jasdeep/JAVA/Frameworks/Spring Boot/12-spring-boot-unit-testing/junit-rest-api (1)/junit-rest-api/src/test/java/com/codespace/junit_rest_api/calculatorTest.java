package com.codespace.junit_rest_api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorTest {

    calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new calculator();
    }

    @Test
    void testMultiply(){
        assertEquals(20, calculator.multiply(4,5));
        assertEquals(25, calculator.multiply(5,5));
    }


}
