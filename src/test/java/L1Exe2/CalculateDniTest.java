package L1Exe2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculateDniTest {
    @ParameterizedTest
    @CsvSource({
            "87654321, X",
            "74325981, D",
            "12345678, Z",
            "11111111, H",
            "99999999, R",
            "60708794, H",
            "55555555, K",
            "90123456, A",
            "23456789, D",
            "12344321, Z"
    })
    public void calculateLetterTest(int numbers, char letter) {
        CalculateDni calculateDni = new CalculateDni(numbers);
        assertEquals(letter, calculateDni.calculateLetter());
    }

    @ParameterizedTest
    @CsvSource({ "-34563", "-314", "-346253324"})
    public void negativeDni (int number){
        try {
            new CalculateDni(number);
            fail("An exception should been thrown");
        } catch (IllegalArgumentException error){
            assertEquals("Invalid number", error.getMessage());
        }
    }

    @ParameterizedTest
    @CsvSource({ "256498759", "837495764", "192837467"})
    public void longestDni(int number){
        try {
            new CalculateDni(number);
            fail("An exception should been thrown");
        } catch (IllegalArgumentException error){
            assertEquals("Invalid number", error.getMessage());
        }
    }
}
