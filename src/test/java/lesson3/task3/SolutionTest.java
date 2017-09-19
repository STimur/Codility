package lesson3.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void emptyArray() throws Exception {
        assertEquals(1, new Solution().solution(new int[0]));
    }
}
