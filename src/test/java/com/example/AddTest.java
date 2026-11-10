package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void testAdd() {
        int result = 10 + 20;
        assertEquals(60, result);   // wrong on purpose: 10 + 20 is 30
    }
}