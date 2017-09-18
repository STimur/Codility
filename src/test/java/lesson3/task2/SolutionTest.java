package lesson3.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void twoElementsArray() throws Exception {
        assertEquals(0, new Solution().solution(new int[2]));
        assertEquals(1, new Solution().solution(new int[]{1, 2}));
        assertEquals(1, new Solution().solution(new int[]{2, 1}));
    }

    @Test
    public void threeElementsArray() throws Exception {
        assertEquals(0, new Solution().solution(new int[]{2, 1, 1}));
    }
}
