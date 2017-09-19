package lesson3.task2;

public class Solution {
    public int solution(int[] A) {
        int diff = -1, newDiff = 0, P = 1, N = A.length;
        while (P < N) {
            newDiff = Math.abs(sum(A, 0, P) - sum(A, P, N));
            if (diff == -1)
                diff = newDiff;
            else if (newDiff < diff)
                diff = newDiff;
            P++;
        }
        return diff;
    }

    private int sum(int[] A, int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++)
            sum += A[i];
        return sum;
    }
}
