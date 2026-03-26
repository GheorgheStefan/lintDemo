package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LintingSampleService {

    public int sumPositiveValues(List<Integer> values) {
        final int minimumAccepted = 0;
        int sum = 0;

        for (final Integer value : values) {
            if (value != null && value > minimumAccepted) {
                sum += value;
            }
        }

        return sum;
    }
}

