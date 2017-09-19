package lesson3.task2;

public class Solution {
    public int solution(int[] A) {
        if (A.length == 2)
            return Math.abs(A[0]-A[1]);

        int i = 0; int j = A.length - 1;
        int diffCandidate = A[i] - A[j];
        while (i+1 != j) {
            if (Math.abs(diffCandidate + A[i+1]) <= Math.abs(diffCandidate - A[j-1])) {
                diffCandidate += A[i++];
            } else {
                diffCandidate -= A[j--];
            }
        }
        return Math.abs(diffCandidate);
    }
}
