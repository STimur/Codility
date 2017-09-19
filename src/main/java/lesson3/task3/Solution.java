package lesson3.task3;

public class Solution {
    public int solution(int[] A) {
        int n = A.length;
        int missed = (n+1) * (n+2) / 2;
        for (int i : A)
            missed -= i;
        return missed;
    }
}
