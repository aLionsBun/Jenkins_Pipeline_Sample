package com.mycompany.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class AppTest {
    public App fB;

    @BeforeEach
    public void setUp() {
        fB = new App();
    }

    @DisplayName("Play FizzBuzz with number = 1")
    @Test
    public void testNumber() {
        String fizzBuzz = fB.play(1);
        Assertions.assertEquals(fizzBuzz, "1");
    }

    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }

    @DisplayName("Play FizzBuzz with number = 5")
    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");
    }

    @DisplayName("Play FizzBuzz with number = 0")
    @Test
    public void testZero() {
        String fizzBuzz = fB.play(0);
        Assertions.assertEquals(fizzBuzz, "Fizz Buzz!");
    }

    @AfterEach
    public void tearDown() {
        fB = null;
    }
}
