import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JUnitWithJavaTest {

    @Test
    void testBuzz(){
        JavaCode subjectUnderTest = new JavaCode();

        String result = subjectUnderTest.fizzBuzz(5);

        assertThat(result).isEqualTo("1 2 Fizz 4 Buzz");
    }

    @Test
    void testOutOfRangeLeftSide(){
        JavaCode subjectUnderTest = new JavaCode();

        String result = subjectUnderTest.fizzBuzz(0);

        assertThat(result).isEqualTo("zu klein!!!");
    }

    @Test
    void testOutOfRangeRightSide(){
        JavaCode subjectUnderTest = new JavaCode();

        String result = subjectUnderTest.fizzBuzz(101);

        assertThat(result).isEqualTo("zu groß!!!");
    }

}
