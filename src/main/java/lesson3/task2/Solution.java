package lesson3.task2;

public class Solution {
    public int solution(int[] A) {
        int diff = Integer.MAX_VALUE;
        int newDiff = 0;
        int P = 1;
        int N = A.length;
        while (P < N) {
            int leftSum = 0;
            for (int i = 0; i < P; i++)
                leftSum += A[i];
            int rightSum = 0;
            for (int i = P; i < N; i++)
                rightSum += A[i];
            newDiff = Math.abs(leftSum - rightSum);
            if (newDiff < diff)
                diff = newDiff;
            P++;
        }
        return diff;
    }
}
