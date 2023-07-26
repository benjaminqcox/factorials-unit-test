package com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialsTest {

    @Test
    public void factorialOne() {
        Assertions.assertEquals(1, Factorials.findRootFactorial(1));
    }

    @Test
    public void factorialTwo() {
        Assertions.assertEquals(2, Factorials.findRootFactorial(2));
    }

    @Test
    public void factorialNegative() {
        Assertions.assertEquals(-1, Factorials.findRootFactorial(-120));
    }

    @Test
    public void factorialZero() {
        Assertions.assertEquals(-1, Factorials.findRootFactorial(0));
    }

    @Test 
    public void factorialOneHundredTwenty() {
        Assertions.assertEquals(5, Factorials.findRootFactorial(120)); 
    }

    @Test
    public void factorialSixty() {
        Assertions.assertEquals(-1, Factorials.findRootFactorial(60)); 
    }
}
