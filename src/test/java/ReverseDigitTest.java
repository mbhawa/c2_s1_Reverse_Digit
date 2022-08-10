import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseDigitTest {
    DigitReverse reverse;

    @BeforeEach
    void setUp() {
        reverse = new DigitReverse();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void givenInputPositiveNumberReverseTheDigit() {
        //arrange
        int number = 12345678;
        int expectedValue = 87654321;
        //act
        int actualValue = reverse.getReverse(number);
        //assert
        Assertions.assertEquals(expectedValue, actualValue, "Please check your code");
    }

    @Test
    void givenInputNegativeNumberReverseTheDigit() {
        //arrange
        int number = -12345678;
        int expectedValue = -87654321;
        //act
        int actualValue = reverse.getReverse(number);
        //assert
        Assertions.assertEquals(expectedValue, actualValue, "Please check your code");

    }
}

