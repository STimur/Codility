package task1;

/**
 * Created by tsalakhe on 07.06.2017.
 */
public class Solution {
    private int binaryGapLength;
    private int binaryGapStartIndex;
    private String binaryIntegerString;

    public int solution(int N) {
        if (N < 5)
            return binaryGapLength;
        binaryIntegerString = Integer.toBinaryString(N);
        return calcBinaryGap();
    }

    private int calcBinaryGap() {
        findBinaryGapCandidate();
        while (binaryGapCandidateFound()) {
            checkBinaryGapCandidate();
            findNextBinaryGapCandidate();
        }
        return binaryGapLength;
    }

    private void findBinaryGapCandidate() {
        binaryGapStartIndex = binaryIntegerString.indexOf("10") + 1;
    }

    private void findNextBinaryGapCandidate() {
        binaryGapStartIndex = binaryIntegerString.indexOf("10", binaryGapStartIndex + binaryGapLength) + 1;
    }

    private void checkBinaryGapCandidate() {
        for (int j = 1; binaryGapStartIndex + j < binaryIntegerString.length(); j++) {
            if (binaryIntegerString.charAt(binaryGapStartIndex + j) == '1') {
                if (j > binaryGapLength)
                    binaryGapLength = j;
                break;
            }
        }
    }

    private boolean binaryGapCandidateFound() {
        return binaryGapStartIndex != 0;
    }
}
