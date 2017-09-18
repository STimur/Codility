package lesson2.task2;

import java.util.Arrays;

/**
 * Created by tsalakhe on 08.06.2017.
 */
public class Solution {
    public int[] solution(int[] numbers, int numberOfShifts) {
        if (numbers.length <= 1 || numberOfShifts == 0)
            return numbers;
        while (numberOfShifts > 0) {
            int a[] = new int[]{numbers[numbers.length - 1]};
            int b[] = Arrays.copyOfRange(numbers, 0, numbers.length - 1);
            System.arraycopy(a, 0, numbers, 0, 1);
            System.arraycopy(b, 0, numbers, 1, numbers.length - 1);
            numberOfShifts--;
        }
        return numbers;
    }
}
