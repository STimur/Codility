package lesson2.task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

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
        assertArrayEquals(new int[]{}, solution.solution(new int[]{}, 0));
        assertArrayEquals(new int[]{0}, solution.solution(new int[]{0}, 0));
        assertArrayEquals(new int[]{0}, solution.solution(new int[]{0}, 1));
        assertArrayEquals(new int[]{0, 1}, solution.solution(new int[]{0, 1}, 0));
        assertArrayEquals(new int[]{1, 0}, solution.solution(new int[]{0, 1}, 1));
        assertArrayEquals(new int[]{0, 1}, solution.solution(new int[]{0, 1}, 2));
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, solution.solution(new int[]{3, 8, 9, 7, 6}, 3));
    }
}
