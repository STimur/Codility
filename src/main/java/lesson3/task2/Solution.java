package lesson3.task2;

public class Solution {
    public int solution(int[] A) {
        int diff = A[0] - A[1];
        return diff > 0 ? diff : (-1) * diff;
    }
}
