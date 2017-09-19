package lesson3.task2;

public class Solution {
    public int solution(int[] A) {
        if (A.length == 2)
            return Math.abs(A[0]-A[1]);

        int i = 0; int j = A.length - 1;
        int diffCandidate = A[i] - A[j];
        i++; j--;
        return Math.abs(count(diffCandidate, A, i, j));
    }

    private int count(int diffCandidate, int[] a, int i, int j) {
        if (i == j)
            return Math.min(Math.abs(diffCandidate + a[i]), Math.abs(diffCandidate - a[j]));
        if (Math.abs(diffCandidate + a[i]) <= Math.abs(diffCandidate - a[j])) {
            diffCandidate += a[i];
            i++;
        } else {
            diffCandidate -= a[j];
            j--;
        }
        return count(diffCandidate, a, i, j);
    }
}
