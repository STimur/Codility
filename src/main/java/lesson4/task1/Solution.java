package lesson4.task1;

public class Solution {
    public int solution(int[] A) {
        int N = A.length;
        boolean B[] = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (A[i] > N || B[A[i] - 1] == true)
                return 0;
            B[A[i] - 1] = true;
        }
        return 1;
    }
}
