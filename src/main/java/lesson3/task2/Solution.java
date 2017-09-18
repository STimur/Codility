package lesson3.task2;

public class Solution {
    public int solution(int[] A) {
        int diff = 0;
        if (A.length == 2)
            diff = A[0] - A[1];
        if (A.length == 3) {
            if (A[0] > A[2])
                diff = A[0] - A[1] - A[2];
            else
                diff = A[0] + A[1] - A[2];
        }
        return diff > 0 ? diff : (-1) * diff;
    }
}
