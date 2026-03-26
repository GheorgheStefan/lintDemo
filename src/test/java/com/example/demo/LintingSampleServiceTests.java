package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LintingSampleServiceTests {

    private final LintingSampleService service = new LintingSampleService();

    @Test
    void sumPositiveValuesIgnoresNullsAndNegatives() {
        final int total = service.sumPositiveValues(Arrays.asList(1, -2, null, 3));

        assertEquals(4, total, "Should sum only positive non-null values");
    }
}
