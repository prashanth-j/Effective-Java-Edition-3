package org.java8.effectiveJava.tdd;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FizzBuzzTest extends TestCase {

    FizzBuzz fizzBuzz;

    @Override
    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizzBuzz() {
        Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(1));
    }

    @Test
    public void testFizzBuzzInput2() {
        Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(2));
    }

    @Test
    public void testFizzBuzzInput3() {
        Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testFizzBuzzInput6() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(6));
    }

    @Test
    public void testFizzBuzzInput10() {
        Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testFizzMulitple5() {
        Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
    }
}
