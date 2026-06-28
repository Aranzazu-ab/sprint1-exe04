package L1Exe2;

import org.junit.jupiter.api.Test;
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
        assertEquals(letter, calculateDni.calculateLetter(numbers));
    }

    @Test
    public void negativeDni(){
        try {
            new CalculateDni(-34563);
            fail("An exception should been thrown");
        } catch (IllegalArgumentException error){
            assertEquals("Invalid number", error.getMessage());
        }

    }

    @Test
    public void longestDni(){
        try {
            new CalculateDni(256498759);
            fail("An exception should been thrown");
        } catch (IllegalArgumentException error){
            assertEquals("Invalid number", error.getMessage());
        }
    }
}
