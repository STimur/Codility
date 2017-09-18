package lesson3.task1;

public class Solution {
    public int solution(int X, int Y, int D) {
        int dist = Y - X;
        int jumps = dist / D;
        return (dist % D > 0) ? (jumps + 1) : jumps;
    }
}
