package lesson4.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    private int[] IntArray(int... ints) {
        return ints;
    }

    private int[] arrayOfIntsFromOneToN(int N) {
        int A[] = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = i + 1;
        return A;
    }

    private void assertIsPermutation(int[] a) {
        assertEquals(1, solution.solution(a));
    }

    private void assertIsNotAPermutation(int[] a) {
        assertEquals(0, solution.solution(a));
    }

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void solution() throws Exception {
        assertIsPermutation(IntArray(1));
        assertIsPermutation(IntArray(1, 2));
        assertIsNotAPermutation(IntArray(1, 1));
        assertIsPermutation(IntArray(4, 1, 3, 2));
        assertIsNotAPermutation(IntArray(4, 1, 3));
        assertIsNotAPermutation(IntArray(1, 2, 3, 3));
        assertIsNotAPermutation(IntArray(1_000_000_000, 1));
        assertIsNotAPermutation(IntArray(4, 1, 1));
        assertIsNotAPermutation(IntArray(3, 3, 3, 1));
        assertIsPermutation(arrayOfIntsFromOneToN(100000));
    }
}
