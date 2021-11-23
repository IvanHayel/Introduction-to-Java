package sorting.task_7;

/*
 * Пусть даны две неубывающие последовательности действительных чисел.
 * Требуется указать те места, на которые нужно вставлять элементы
 * второй последовательности, чтобы новая последовательность оставалась возрастающей.
 */

import java.util.*;
import java.util.stream.*;

public class Task7 {
    public static void main(String[] args) {
        double[] firstAscSequence = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 8.9};
        System.out.print("First ascending sequence ");
        show(firstAscSequence);
        double[] secondAscSequence = {0.1, 0.1, 2.2, 4.5, 5.6, 6.6, 7.6, 10.1};
        System.out.print("Second ascending sequence ");
        show(secondAscSequence);
        System.out.println("Combined ascending sequence " + getConcatSequence(firstAscSequence, secondAscSequence));
        System.out.println("Places to insert elements:");
        showPlacesToInsert(secondAscSequence, firstAscSequence);
    }

    private static void showPlacesToInsert(double[] fromArray, double[] intoArray) {
        List<Double> list = getConcatSequence(fromArray, intoArray);
        Set<Integer> distinctIndices = new HashSet<>();
        for (double value : fromArray) {
            int indexToPlace = list.indexOf(value);
            while (distinctIndices.contains(indexToPlace))
                indexToPlace++;
            distinctIndices.add(indexToPlace);
            System.out.println("Insert value " + value +
                    " at index " + indexToPlace);
        }
    }

    private static List<Double> getConcatSequence(double[] firstSequence, double[] secondSequence) {
        DoubleStream from = DoubleStream.of(firstSequence);
        DoubleStream into = DoubleStream.of(secondSequence);
        return DoubleStream.concat(from, into).sorted().boxed().collect(Collectors.toList());
    }

    private static void show(double[] array) {
        System.out.println(Arrays.toString(array));
    }
}