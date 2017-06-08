package task1;

/**
 * Created by tsalakhe on 07.06.2017.
 */
public class Solution {
    public int solution(int N) {
        if (N > 3)
            return calcBinaryGap(Integer.toBinaryString(N));
        return 0;
    }

    private int calcBinaryGap(String s) {
        int res = 0;
        int i = s.indexOf("10");
        while (i != -1) {
            for (int j = 2; i+j < s.length(); j++) {
                if (s.charAt(i + j) == '1') {
                    if (j-1 > res)
                        res = j - 1;
                    break;
                }
            }
            i = s.indexOf("10", i + res + 1);
        }
        return res;
    }
}
