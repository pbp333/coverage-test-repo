import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class WhateverTest {

    private Whatever s = new Whatever();

    @Test
    public void returnsWhat() {

        var result = s.getWhat();

        assertEquals("what", result);
    }

}