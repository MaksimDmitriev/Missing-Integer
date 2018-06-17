package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void singlePositive() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{2}));
    }

    @Test
    public void singlePositiveOne() {
        Solution solution = new Solution();
        assertEquals(2, solution.solution(new int[]{1}));
    }

    @Test
    public void twoIntegers() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(new int[]{1, 2}));
    }

    @Test
    public void onlyNegative() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{-1, -2}));
    }

    @Test
    public void uniqueIntSet() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{56, 5, 2, 567, 8}));
    }

    @Test
    public void uniqueIntSetWithOne() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(new int[]{1, 56, 5, 2, 567, 8}));
    }
}