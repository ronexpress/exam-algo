package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> Math.abs(number % 2) == 1)
                .reduce(0, (total, number) -> total + number, Integer::sum);
    }
}