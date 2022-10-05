package com.playground.main.pracTces.sort;

import java.util.Arrays;
import java.util.Collections;

//TODO https://www.codechef.com/submit/MAXEXP
public class MaxExp {

    public static String generateMaxStatement(String input, int inputSize) {
        int minusCounter = 0;
        int plusCounter = 0;
        StringBuilder numbersStringBuilder = new StringBuilder();

        for (int i = 0; i < inputSize; i++) {
            if (input.charAt(i) == '+')
                plusCounter++;
            else if (input.charAt(i) == '-')
                minusCounter++;
            else
                numbersStringBuilder.append(input.charAt(i));
        }
        String numbersString = numbersStringBuilder.toString();
        Integer[] numbers = new Integer[numbersString.length()];
        for (int i = 0; i < numbersString.length(); i++) {
            numbers[i] = Character.getNumericValue(numbersString.charAt(i));
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (numbers.length - plusCounter - minusCounter > i) {
            output.append(numbers[i]);
            i++;
        }

        while (plusCounter > 0) {
            plusCounter--;
            output.append("+");
            output.append(numbers[i]);
            i++;
        }

        while (minusCounter > 0) {
            minusCounter--;
            output.append("-");
            output.append(numbers[i]);
            i++;
        }
        return output.toString();
    }
}
