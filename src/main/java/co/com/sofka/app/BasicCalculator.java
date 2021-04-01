package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 + number2;
    }

    public Long subtrac(Long number1, Long number2) {
        logger.info("Resting {} + {}", number1, number2);
        return number1 - number2;
    }

    public Long multi(Long number1, Long number2) {
        logger.info("multiplicating {} * {}", number1, number2);
        return number1 * number2;
    }

    public long divide(Long number1, Long number2) {
        logger.info("dividing {} / {}", number1, number2);
        try {
            return number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("Division entre cero (indeterminación)");
            return 0;
        }
        // TODO: RESTA, MULTIPLICACION Y DIVISION
    }
}