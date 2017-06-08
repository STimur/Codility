package lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by tsalakhe on 07.06.2017.
 */
public class SolutionTest {
    @Test
    public void testSolution() {
        assertEquals(0, new Solution().solution(Integer.valueOf("0", 2)));
        assertEquals(0, new Solution().solution(Integer.valueOf("10", 2)));
        assertEquals(1, new Solution().solution(Integer.valueOf("101", 2)));
        assertEquals(0, new Solution().solution(Integer.valueOf("1111", 2)));
        assertEquals(2, new Solution().solution(Integer.valueOf("1001", 2)));
        assertEquals(3, new Solution().solution(Integer.valueOf("10001", 2)));
        assertEquals(1, new Solution().solution(Integer.valueOf("10100", 2)));
        assertEquals(9, new Solution().solution(Integer.valueOf("10000000001", 2)));
        assertEquals(2, new Solution().solution(Integer.valueOf("100101", 2)));
        assertEquals(2, new Solution().solution(Integer.valueOf("101001", 2)));
        assertEquals(3, new Solution().solution(Integer.valueOf("1010010001", 2)));
        assertEquals(4, new Solution().solution(Integer.valueOf("1000010001", 2)));
        assertEquals(5, new Solution().solution(1041));
        assertEquals(1, new Solution().solution(101_2));

    }
}
