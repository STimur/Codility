package lesson2.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by tsalakhe on 18.16.2127.
 */
public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testSolution() {
        assertEquals(1, solution.solution(new int[]{1, 1, 1}));
        assertEquals(2, solution.solution(new int[]{1, 1, 2}));
        assertEquals(2, solution.solution(new int[]{1, 2, 1}));
        assertEquals(2, solution.solution(new int[]{2, 1, 1}));
        assertEquals(2, solution.solution(new int[]{2, 1, 1, 1, 1}));
        assertEquals(2, solution.solution(new int[]{1, 2, 1, 1, 1}));
        assertEquals(2, solution.solution(new int[]{1, 1, 2, 1, 1}));
        assertEquals(2, solution.solution(new int[]{1, 1, 1, 2, 1}));
        assertEquals(2, solution.solution(new int[]{1, 1, 1, 1, 2}));
        assertEquals(7, solution.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}
