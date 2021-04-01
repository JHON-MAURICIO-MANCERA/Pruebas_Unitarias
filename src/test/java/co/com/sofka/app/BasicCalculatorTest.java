package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing Suma 1+1=2")
    void sum() {
        //Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        //Act
        Long result = basicCalculator.sum(number1, number2);

        //Assert
        assertEquals(expectedValue, result);

    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}") //comodines, complementan los nombres
    @CsvSource({ // las combinaciones de la suma
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }


    @DisplayName("Testing several rest")
    @ParameterizedTest(name = "{0} - {1} = {2}") //comodines, complementan los nombres
    @CsvSource({ // las combinaciones de la suma
            "0,    1,   -1",
            "1,    1,   0",
            "49,  51,  -2",
            "8,    2,   6"
    })
    public void severalSubtrac(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtrac(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several Multiplication")
    @ParameterizedTest(name = "{0} * {1} = {2}") //comodines, complementan los nombres
    @CsvSource({ // las combinaciones de la suma
            "0,    1,   0",
            "1,    0,   0",
            "-10,  -12,  120",
            "8,    -2,   -16"
    })
    public void severalRest(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multi(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several Divide")
    @ParameterizedTest(name = "{0} / {1} = {2}") //comodines, complementan los nombres
    @CsvSource({ // las combinaciones de la suma
            "25,    5,   5",
            "9,    3,   3",
            "0,  -12,  0",
            "8,    0,   0"
    })
    public void severalDive(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.divide(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}