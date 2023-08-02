package org.java8.atlassian.assement;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RateLimitAssementTest extends TestCase {

    private RateLimitAssement rateLimitAssement;

    @Override
    @Before
    public void setUp() throws Exception {
        rateLimitAssement = new RateLimitAssement();
    }

    @Test
    public void testRateLimitFortheCustomer() {
        Assert.assertTrue(rateLimitAssement.rateLimit(101));
    }
}