package lesson2;

/**
 * Created by tsalakhe on 08.06.2017.
 */
public class Solution {
    public int solution(int[] numbers) {
        int res = 0;
        for (int i : numbers)
            res = res ^ i;
        return res;
    }
}
