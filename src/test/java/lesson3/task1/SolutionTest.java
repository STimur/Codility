package lesson3.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void noJumpsNeeded() throws Exception {
        assertEquals(0, new Solution().solution(1, 1, 1));
    }
}
