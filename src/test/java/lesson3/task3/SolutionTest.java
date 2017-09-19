package lesson3.task3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    private int[] intArray(int... ints) {
        return ints;
    }

    private void assertMissedElement(int[] array, int missedElement) {
        assertEquals(missedElement, solution.solution(array));
    }

    @Test
    public void emptyArray() throws Exception {
        assertMissedElement(intArray(), 1);
    }

    @Test
    public void oneElementArray() throws Exception {
        assertMissedElement(intArray(1), 2);
        assertMissedElement(intArray(2), 1);
    }
}
