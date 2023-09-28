package org.example.Statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMaximum() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        System.out.println("Максимальное число: " + actual);

        Assertions.assertEquals(expected, actual);
    }
}