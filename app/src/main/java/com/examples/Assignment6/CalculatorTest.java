package com.examples.Assignment6;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{

    Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    public void testAdd(){
        int expected = 35;
        int actual = calculator.add(10,25);
        assertEquals(expected,actual);
    }

    public void testSubtract(){
        int expected = 15;
        int actual = calculator.subtract(40,25);
        assertEquals(expected,actual);
    }

    public void testMultiply(){
        int expected = 50;
        int actual = calculator.multiply(10,5);
        assertEquals(expected,actual);
    }

    public void testDivide(){
        int expected = 4;
        int actual = calculator.divide(100,25);
        assertEquals(expected,actual);
    }

}
