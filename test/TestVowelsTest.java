package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckVowelTest {
    TestVowels obj;
    @Before
    public void setUp() throws Exception {
        obj = new TestVowels();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void strMatcher() {
        assertEquals("correct",obj.isVowel(e));
        
    }

}
