package com.codecool.sum_of_odd_numbers;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import cccr.CCCRTestExecutionListener;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith({CCCRTestExecutionListener.class})
public class OddNumbersTest {

    @Test
    public void testMixedNumbers() {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 6));
        assertEquals(8, OddNumbers.sum(numbers));
    }

    @Test
    public void testOnlyEvens() {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8));
        assertEquals(0, OddNumbers.sum(numbers));
    }

    @Test
    public void testOnlyOdds() {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(5, 13, 9));
        assertEquals(27, OddNumbers.sum(numbers));
    }

    @Test
    public void testEmptyList() {
        List<Integer> numbers = new ArrayList<Integer>();
        assertEquals(0, OddNumbers.sum(numbers));
    }

    @Test
    public void testNegatives() {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(4, -5, 9, 2));
        assertEquals(4, OddNumbers.sum(numbers));
    }
}