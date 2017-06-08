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

    private boolean binaryGapCandidateFound() {
        return binaryGapStartIndex != 0;
    }

    private void checkBinaryGapCandidate() {
        for (int length = 1; binaryGapStartIndex + length < binaryIntegerString.length(); length++) {
            if (isBinaryGapOfLength(length)) {
                setBinaryGapLength(length);
                break;
            }
        }
    }

    private void setBinaryGapLength(int binaryGapLength) {
        if (this.binaryGapLength < binaryGapLength)
            this.binaryGapLength = binaryGapLength;
    }

    private boolean isBinaryGapOfLength(int length) {
        return binaryIntegerString.charAt(binaryGapStartIndex + length) == '1';
    }

    private void findNextBinaryGapCandidate() {
        binaryGapStartIndex = binaryIntegerString.indexOf("10", binaryGapStartIndex + binaryGapLength) + 1;
    }
}
