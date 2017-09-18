package lesson3.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void twoElementsArray() throws Exception {
        assertEquals(0, new Solution().solution(new int[2]));
    }
}
