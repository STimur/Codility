package lesson2.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by tsalakhe on 18.16.2127.
 */
public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testSolution() {
        assertArrayEquals(new int[]{}, solution.solution(new int[]{}, 0));
    }
}
