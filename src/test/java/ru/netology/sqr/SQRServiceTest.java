package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/values.csv")
    public void shouldCalcExact(int expected, int lowerBound, int upperBound) {
        SQRService service = new SQRService();
        int actual = service.calcSqr(lowerBound, upperBound);

        Assertions.assertEquals(expected, actual);
    }


}
