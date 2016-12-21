package com.codingchallenges;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by davidtan on 21/12/2016.
 */
public class SortedChallengeTest {
    @Test
    public void shouldReturnYesAscending() throws Exception {
        int[] array = new int[]{1, 2};
        assertEquals("yes, ascending", SortedChallenge.isSortedAndHow(array));
    }

    @Test
    public void shouldReturnNo() throws Exception {
        int[] array = new int[]{1, 3, 2};
        assertEquals("no", SortedChallenge.isSortedAndHow(array));
    }

    @Test
    public void shouldReturnYesDescending() throws Exception {
        int[] array = new int[]{3, 2, 1, 0};
        assertEquals("yes, descending", SortedChallenge.isSortedAndHow(array));
    }

}