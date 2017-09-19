package lesson3.task2;

public class Solution {
    public int solution(int[] A) {
        int i = 0, j = A.length - 1, leftSum = A[i], rightSum = A[j];

        while (j - i != 1) {
            if (leftSum >= 0) {
                if (leftSum <= rightSum) {
                    i++;
                    leftSum += A[i];
                } else if (rightSum >= 0) {
                    j--;
                    rightSum += A[j];
                } else {
                    j--;
                    rightSum += A[j];
                }
            } else {
                if (leftSum > rightSum) {
                    i++;
                    leftSum += A[i];
                } else {
                    j--;
                    rightSum += A[j];
                }
            }
        }

        return Math.abs(leftSum - rightSum);
    }
}
