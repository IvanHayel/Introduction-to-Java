package methods.task_15;

/*
 * Найти все натуральные n-значные числа, цифры в которых образуют строго
 * возрастающую последовательность (например, 1234, 5789).
 * Для решения задачи использовать декомпозицию.
 */

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Task15 {
    public static void main(String[] args) {
        int digitsQuantity = 8;
        showNumbersWithAscDigits(digitsQuantity);
    }

    private static void showNumbersWithAscDigits(int digitsQuantity) {
        List<Integer> numbersWithAscDigits = getNumbersWithAscDigits(digitsQuantity);
        System.out.println("Digits in which numbers form a strictly ascending sequence:");
        System.out.println(numbersWithAscDigits);
    }

    private static List<Integer> getNumbersWithAscDigits(int digitsQuantity) {
        List<Integer> numbersWithAscDigits = new ArrayList<>();
        int fromNumber = (int) pow(10, digitsQuantity - 1);
        int toNumber = (int) pow(10, digitsQuantity);
        for (int counter = fromNumber; counter < toNumber; counter++)
            if (isDigitsAscending(counter))
                numbersWithAscDigits.add(counter);
        return numbersWithAscDigits;
    }

    private static boolean isDigitsAscending(int number) {
        int tempDigit = number % 10;
        while (number != 0) {
            number /= 10;
            if (number % 10 >= tempDigit)
                return false;
            tempDigit = number % 10;
        }
        return true;
    }
}