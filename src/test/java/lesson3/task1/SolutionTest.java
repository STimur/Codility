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
}
