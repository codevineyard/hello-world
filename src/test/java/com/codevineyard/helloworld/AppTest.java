package com.codevineyard.helloworld;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void shouldReturnHelloWorld() {
        assertEquals("Hello World!", app.getMessage());
    }
}
