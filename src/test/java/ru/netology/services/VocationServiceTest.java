package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VocationServiceTest {

    @Test
    public void thresholdTwentyThousand() {
        VocationService service = new VocationService();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int timeForTheRest = service.calculate(income, expenses, threshold);
        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void thresholdHundredAndFiftyThousand() {
        VocationService service = new VocationService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int timeForTheRest = service.calculate(income, expenses, threshold);
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}

//@ParameterizedTest
//@CsvFileSource(files = "srs/test/resources/finance.csv")
//public void thresholdTimeForTheRest(int expected, int income, int
//expenses, int threshold) {
//VocationService service = new VocationService();
//int timeForTheRest = service.calculate(income, expenses, threshold);
//int actual = service.calculate(income, expenses, threshold);
//
//Assertions.assertEquals(expected, actual);