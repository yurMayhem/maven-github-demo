package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void testAdd() {
        int result = 10 + 20;
        assertEquals(30, result);   // correct now: 10 + 20 = 30   
    }
}