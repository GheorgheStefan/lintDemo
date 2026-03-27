package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class LintingSampleService {

    public int sumPositiveValues(final List<Integer> values) {
        final int minimumAccepted = 0;
        int sum = 0;
        int counter = 0; // unused

        for (final Integer value : values) {
            if (value != null && value > minimumAccepted) {
                sum += value;
            }
        }

        return sum;
    }

//     public int needBracesExample(final List<Integer> values) {
//         int sum = 0;
//
//         for (final Integer value : values)
//             if (value != null && value > 0)
//                 sum += value;
//
//         while (sum < 10)
//             sum++;
//
//         return sum;
//     }
//
//     public void emptyBlockExample(final List<Integer> values) {
//         if (values == null) {
//         }
//
//         try {
//             riskyCall();
//         } catch (final RuntimeException ex) {
//         }
//
//         try {
//             riskyCall();
//         } finally {
//         }
//     }
//
//     private void riskyCall() {
//     }
}
