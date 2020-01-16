import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BasicTest {

    @Test
    void testBuzz(){
        FizzBuzz subjectUnderTest = new FizzBuzz();

        String result = subjectUnderTest.fizzBuzz(5);

        assertThat(result).isEqualTo("1 2 Fizz 4 Buzz");
    }

    @Test
    void testFizzBuzz(){
        FizzBuzz subjectUnderTest = new FizzBuzz();

        String result = subjectUnderTest.fizzBuzz(15);

        assertThat(result).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz");
    }

    @Test
    void testOutOfRangeLeftSide(){
        FizzBuzz subjectUnderTest = new FizzBuzz();

        String result = subjectUnderTest.fizzBuzz(0);

        assertThat(result).isEqualTo("zu klein!!!");
    }

    @Test
    void testOutOfRangeRightSide(){
        FizzBuzz subjectUnderTest = new FizzBuzz();

        String result = subjectUnderTest.fizzBuzz(101);

        assertThat(result).isEqualTo("zu groß!!!");
    }

}
