package one_dimensional_arrays.task_1;

import java.util.Arrays;

public class NaturalNumbers {
    private int[] numbers;

    public NaturalNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int sumElementsMultipleOf(int k) {
        int sum = 0;
        for (int element : numbers) {
            if (element % k == 0) {
                sum += element;
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "NaturalNumber{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
