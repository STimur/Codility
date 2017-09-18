package lesson2.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tsalakhe on 18.16.2127.
 */
public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testSolution() {
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
