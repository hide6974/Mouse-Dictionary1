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
    // void testRemoveDuplicates() {

    //     Solution solution = new Solution();
    //     int expected = 2;
    //     int[] param ={1,1,3};
    //     int actual = 0;

    //     actual = solution.removeDuplicates(param);

    //     assertEquals(expected, actual);
    // }

    
    void testRemoveElement() {
        Solution solution = new Solution();
        int[] param ={3,2,2,3};
        int val =3;
    
        int expected = 2;
        int actual = 0;

        actual = solution.removeElement(param,val);

        assertEquals(expected, actual);
    }

       
    void testRemoveElements() {
        Solution solution = new Solution();

        ListNode head =new ListNode();
        head. ={1,2,6,3,4,5,6};
        int val =6;
    
        int expected = 2;
        int actual = 0;

        actual = solution.removeElement(head,val);

        assertEquals(expected, actual);
    }
}



