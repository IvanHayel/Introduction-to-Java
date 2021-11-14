package cycles.task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        NaturalNumbers numbers = new NaturalNumbers();
        System.out.println(numbers);
        numbers.showDivisors();
    }
}

final class NaturalNumbers {
    private int m;
    private int n;
    ArrayList<Integer> numbers;

    public NaturalNumbers() {
        enterRangeOfNaturalNumbers();
        fillNumbers();
    }

    public NaturalNumbers(int m, int n) {
        this.m = m;
        this.n = n;
        fillNumbers();
    }

    private void fillNumbers() {
        numbers = new ArrayList<>();
        for (int number = m; number <= n; number++) {
            numbers.add(number);
        }
    }

    public void enterRangeOfNaturalNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range of natural numbers");
        System.out.print("from: ");
        m = scanner.nextInt();
        System.out.print("to: ");
        n = scanner.nextInt();
    }

    public void showDivisors() {
        for (Integer number : numbers) {
            System.out.print("Divisors for " + number + ": ");
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "NaturalNumbers{" +
                "m=" + m +
                ", n=" + n +
                ", numbers=" + numbers +
                '}';
    }
}