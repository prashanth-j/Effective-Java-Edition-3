package org.java8.effectiveJava.tdd;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Optional;

@RunWith(JUnit4.class)
public class CountStringsTest extends TestCase {

    CountStrings countStrings;

    @Override
    @Before
    public void setUp() throws Exception {
        countStrings = new CountStrings();
    }

    @Test
    public void countString() {
        String input = "She sells sea shells";
        Assert.assertEquals(Optional.of(1), countStrings.countString(input).get("she"));
    }
}