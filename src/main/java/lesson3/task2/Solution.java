package lesson3.task2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        int leftSum = 0;
        int rightSum = Arrays.stream(A).sum();
        Integer minDiff = null;
        for (int k = 0; k < A.length - 1; k++) {
            leftSum += A[k];
            rightSum -= A[k];
            int diff = leftSum - rightSum;
            if (minDiff == null)
                minDiff = diff;
            else if (Math.abs(diff) < Math.abs(minDiff))
                minDiff = diff;
        }
        return Math.abs(minDiff);
    }

    public int subOptimalSolution(int[] A) {
        if (A.length == 2)
            return Math.abs(A[0] - A[1]);

        int i = 0;
        int j = A.length - 1;
        int diffCandidate = A[i] - A[j];
        while (i + 1 != j) {
            if (Math.abs(diffCandidate + A[i + 1]) <= Math.abs(diffCandidate - A[j - 1])) {
                diffCandidate += A[++i];
            } else {
                diffCandidate -= A[--j];
            }
        }
        return Math.abs(diffCandidate);
    }

    public int quadraticSolution(int[] A) {
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
