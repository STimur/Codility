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

    private void assertMissedElement(int[] array, int missedElement) {
        assertEquals(missedElement, solution.solution(array));
    }

    private int[] intArray(int... ints) {
        return ints;
    }

    private int[] intArrayWithoutElement(int n, int elem) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i + 1 == elem)
                array[i] = n + 1;
            else
                array[i] = i + 1;
        }
        return array;
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

    @Test
    public void acceptance() throws Exception {
        int n = 5;
        for (int i = 1; i <= n; i++)
            assertMissedElement(intArrayWithoutElement(n, i), i);
    }
}
