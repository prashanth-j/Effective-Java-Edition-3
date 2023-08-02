package org.java8.assesment;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class BallotManagementTest extends TestCase {

    private BallotManagement ballotManagement;

    @Override
    @Before
    public void setUp() throws Exception {
        ballotManagement = new BallotManagement();
    }

    @Test
    public void testGetResults() {
        Vote vote = new Vote("a", 3);
        Vote vote1 = new Vote("b", 2);
        Vote vote2 = new Vote("c", 1);
        Vote vote3 = new Vote("a", 3);
        Assert.assertEquals(List.of("a", "b", "c"), ballotManagement.getResults(List.of(new Ballot(vote),
                new Ballot(vote1),
                new Ballot(vote2),
                new Ballot(vote3))));
    }
}