package string.task_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Given text (string). Find the largest number of consecutive spaces in it.
 */

public class Task_1 {
    public static void main(String[] args) {
        String text = "   Truth          can    only be   found in one place:  the code .";
        System.out.println(text);
        int largestNumberOfSpaces = getLargestNumberOfSpaces(text);
        System.out.println("The largest number of consecutive spaces is " + largestNumberOfSpaces);
    }

    private static int getLargestNumberOfSpaces(String text) {
        Pattern pattern = Pattern.compile(" +");
        Matcher matcher = pattern.matcher(text);
        int numberOfSpace;
        int largestNumberOfSpace = 0;
        while (matcher.find()) {
            numberOfSpace = matcher.group().length();
            if (largestNumberOfSpace < numberOfSpace) {
                largestNumberOfSpace = numberOfSpace;
            }
        }
        return largestNumberOfSpace;
    }
}