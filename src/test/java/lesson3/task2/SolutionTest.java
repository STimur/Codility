package lesson3.task2;

import org.junit.Before;
import org.junit.Ignore;
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

    private int[] bigIntArray(int n) {
        int[] array = new int[n];
        for (int i=0; i < n; i++)
            array[i] = (int) (Math.random()*1000);
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
        assertMinDiff(intArray(2, 1, 1), 0);
        assertMinDiff(intArray(1, 1, 2), 0);
        assertMinDiff(intArray(-2, -1, -1), 0);
        assertMinDiff(intArray(-1, -1, -2), 0);
    }

    @Test
    public void acceptance() throws Exception {
        assertMinDiff(intArray(3, 1, 2, 4, 3), 1);
        assertMinDiff(intArray(-10, -5, -3, -4, -5), 3);
    }

    @Test
    public void performance() throws Exception {
        solution.solution(bigIntArray(1000));
    }
}
