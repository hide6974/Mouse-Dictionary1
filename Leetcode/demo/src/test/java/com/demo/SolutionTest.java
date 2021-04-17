package com.demo;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class SolutionTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {

        Solution solution = new Solution();
        int expected = 2;
        int[] param ={1,1,3};
        int actual = 0;

        actual = solution.removeDuplicates(param)-1;

        assertEquals(expected, actual);
    }
}



