package lesson3.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void noJumpsNeeded() throws Exception {
        assertEquals(0, solution.solution(1, 1, 1));
    }

    @Test
    public void oneJumpNeeded() throws Exception {
        assertEquals(1, solution.solution(1, 2, 1));
        assertEquals(1, solution.solution(1, 3, 2));
        assertEquals(1, solution.solution(1, 3, 3));
    }

    @Test
    public void multipleJumpsNeeded() throws Exception {
        assertEquals(2, solution.solution(1, 3, 1));
        assertEquals(2, solution.solution(1, 4, 2));
        assertEquals(3, solution.solution(10, 85, 30));
        assertEquals(10, solution.solution(10, 110, 10));
        assertEquals(8, solution.solution(1, 53, 7));
    }
}
