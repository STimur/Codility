package lesson3.task1;

public class Solution {
    public int solution(int X, int Y, int D) {
        if (Y-X > 1 && Y-X < D)
            return 1;
        return (Y-X)/D;
    }
}
