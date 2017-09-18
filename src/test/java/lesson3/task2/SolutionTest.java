package lesson3.task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    private void assertMinDiff(int[] tape, int expected) {
        assertEquals(expected, solution.solution(tape));
    }

    private int[] intArray(int... ints) {
        int[] array = new int[ints.length];
        for (int i = 0; i < ints.length; i++)
            array[i] = ints[i];
        return array;
    }

    @Test
    public void twoElementsArray() throws Exception {
        assertMinDiff(intArray(0, 0), 0);
        assertMinDiff(intArray(1, 2), 1);
        assertMinDiff(intArray(2, 1), 1);
    }

    @Test
    public void threeElementsArray() throws Exception {
        assertMinDiff(new int[]{2, 1, 1}, 0);
    }
}
