package lesson3.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void emptyArray() throws Exception {
        assertEquals(1, new Solution().solution(new int[0]));
    }

    @Test
    public void oneElementArray() throws Exception {
        assertEquals(2, new Solution().solution(new int[]{1}));
        assertEquals(1, new Solution().solution(new int[]{2}));
    }
}
