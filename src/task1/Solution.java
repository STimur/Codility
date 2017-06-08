package task1;

/**
 * Created by tsalakhe on 07.06.2017.
 */
public class Solution {
    private int binaryGapLength = 0;
    private int binaryGapStartIndex;

    public int solution(int N) {
        if (N > 4)
            return calcBinaryGap(Integer.toBinaryString(N));
        return binaryGapLength;
    }

    private int calcBinaryGap(String s) {
        binaryGapStartIndex = s.indexOf("10") + 1;
        while (binaryGapStartIndex != 0) {
            for (int j = 1; binaryGapStartIndex + j < s.length(); j++) {
                if (s.charAt(binaryGapStartIndex + j) == '1') {
                    if (j > binaryGapLength)
                        binaryGapLength = j;
                    break;
                }
            }
            binaryGapStartIndex = s.indexOf("10", binaryGapStartIndex + binaryGapLength) + 1;
        }
        return binaryGapLength;
    }
}
